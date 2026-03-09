package Labor4_2;

public class Customer {
    private String FirstName;
    private String LastName;
    private BankAccount Account;

    public Customer(String firstName, String lastName) {
        FirstName = firstName;
        LastName = lastName;

    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
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


    @Override
    public String toString() {
        return "Customer{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Account=" + Account +
                '}';
    }
}
