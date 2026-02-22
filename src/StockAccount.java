import java.util.ArrayList;

public class StockAccount {
    ArrayList<CompanyShares> companySharesList = new ArrayList<>();

    public void buyshares(String symbol,int shares) {
        for (int i = 0; i <companySharesList.size() ; i++) {
            CompanyShares cs = companySharesList.get(i);
            if(symbol.equals(cs.stockSymbol)){
                cs.SharesCount+=shares;

            }
        }


    }
}
