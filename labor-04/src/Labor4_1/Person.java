package Labor4_1;

import Labor4_2.BankAccount;
import Labor4_2.Customer;

public class Person {
    private String firstname;
    private String lastname;
    private int birthyear;
    private BankAccount Account;

    public Person(String firstname, String lastname, int birthyear) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthyear = birthyear;
    }
    public void setAccount(String AccName) {
        this.Account = new BankAccount(AccName);
    }
    public BankAccount getAccount() {
        return this.Account;
    }
    public void closeAccount() {
        this.Account =null;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthyear=" + birthyear +
                '}';
    }
}
