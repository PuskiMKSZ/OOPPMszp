package oop.labor06;

public class BankAccount {

    private static final String PREFIX = "OTP";
    private static final int ACCOUNT_NUMBER_LENGTH = 10;
    private static int numAccounts = 0;

    private String accountNumber;
    private double balance;


    public BankAccount() {
        numAccounts++;
        this.accountNumber = createAccountNumber();
        this.balance = 0;
    }
    private String createAccountNumber() {
        String num = String.valueOf(numAccounts);
        StringBuilder sb = new StringBuilder(PREFIX);

        while (sb.length() < ACCOUNT_NUMBER_LENGTH - num.length()) {
            sb.append("0");
        }
        sb.append(num);
        return sb.toString();
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Számlaszám: " + accountNumber + ", Egyenleg: " + balance + " Ft";
    }
}