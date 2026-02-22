import java.util.*;
public class StockMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StockPortfolio portfolio=new StockPortfolio();
        System.out.println("Enter number of stocks");
        int n= sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Stock " + (i + 1));
            System.out.print("Stock Name: ");
            String name = sc.next();

            System.out.print("Number of Shares: ");
            int shares = sc.nextInt();

            System.out.print("Share Price: ");
            double price = sc.nextDouble();
        portfolio.addStock(new  Stock(name,shares,price));
        }
        portfolio.printDetails();

    }
}
