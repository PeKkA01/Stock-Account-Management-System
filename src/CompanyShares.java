import java.time.LocalDateTime;
public class CompanyShares {
     String stockSymbol;
     String SharesCount;
    LocalDateTime datetime;

    public CompanyShares(String stockSymbol, String SharesCount,LocalDateTime datetime) {
        this.stockSymbol = stockSymbol;
        this.SharesCount = SharesCount;
        this.datetime=datetime;
    }


}
