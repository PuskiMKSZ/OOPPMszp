package oop.labor06;

import java.util.ArrayList;

public class Customer {
    private static int numCustomers = 0; // Statikus számláló az ID-hoz
    private int id;


    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public Customer(String firstName, String lastName) {
        numCustomers++;
        this.id = numCustomers;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public int getNumAccounts() {
        return accounts.size();
    }

    public ArrayList<String> getAccountNumbers() {
        ArrayList<String> numbers = new ArrayList<>();
        for (BankAccount account : accounts) {
            numbers.add(account.getAccountNumber());
        }
        return numbers;
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public BankAccount getAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public void closeAccount(String accountNumber) {
        BankAccount account = getAccount(accountNumber);
        if (account != null) {
            accounts.remove(account);
        }
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Név: " + firstName + " " + lastName + " | Számlák száma: " + accounts.size();
    }
}