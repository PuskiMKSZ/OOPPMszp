package Labor4_2;

public class BankAccount {
    private String accountNumber;
    private double balance;


    public String getAccountNumber() {
        return accountNumber;
    }
    public BankAccount(String accountNumber){
        this.accountNumber=accountNumber;
        this.balance=0;
    }
    public double getBalance() {
        return balance;
    }
    void deposit(double amount){
        this.balance+=amount;
    }
    void withdraw(double amount){
        this.balance-=amount;


    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
