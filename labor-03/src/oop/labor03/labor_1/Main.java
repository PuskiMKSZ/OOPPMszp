package oop.labor03.labor_1;

public class Main {
     public static void main(String[] args) {

        BankAccount account1 = new BankAccount("OTP00001");
        System.out.println(account1.getAccountNumber()+": "+account1.getBalance());
        account1.deposit(1000);
        System.out.println(account1.getAccountNumber()+": "+account1.getBalance());
        account1.withdraw(500);
        System.out.println(account1.getAccountNumber()+": "+account1.getBalance());
        BankAccount account2 = new BankAccount("OTP00002");
        account2.deposit(1120);
        System.out.println(account2.getAccountNumber()+": "+account2.getBalance());
        Customer customer1=new Customer("pal", " pista");
        System.out.println(customer1.getFirstName());
        System.out.println(customer1.getLastName());
        customer1.setAccount("Otp00001");
         System.out.println(customer1.getAccount());
         Customer customer2=new Customer("pal", " klara");
         customer2.closeAccount();

         customer2.setAccount(customer1.getAccount());
         System.out.println(customer2.getAccount());
}
}
