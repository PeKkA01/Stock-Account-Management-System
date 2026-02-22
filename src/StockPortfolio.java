import java.util.ArrayList;

public class StockPortfolio {
    ArrayList<Stock>stocksList=new ArrayList<>();

    public void addStock(Stock stock){
    stocksList.add(stock);
    }
      public void printDetails(){
        double TotalValue=0;
          for (int i = 0; i <stocksList.size() ; i++) {
              Stock s=stocksList.get(i);
           double   value= s.getStockValue();
              System.out.println("Stock: "+s.stockName+
                      " Stock price: "+s.sharePrice+
                      " Number of Shares: "+s.numberOfShares+
                      " Value: "+s.getStockValue());
              TotalValue += value;
          }
          System.out.println("TOTAL PORTFOLIO VALUE: "+TotalValue);

      }


}