public class Account {
    private double balance;
    public Account(double balance){
        this.balance=balance;
    }
    public void Debit(double amount){
        if(amount<=balance){
            balance -=amount;
            System.out.println("Amount debited succfesfully");
            System.out.println("Balance Left: "+balance);
        }else{
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}
