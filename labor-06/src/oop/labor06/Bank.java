package oop.labor06;
  import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Customer getCustomer(int id) {
        for (Customer c : customers) {
            if (c.getId() == id) return c;
        }
        return null;
    }

    public int numCustomers() {
        return customers.size();
    }

    // Általános kiírató metódus (ezt használja a többi)
    public void printCustomers(PrintStream ps) {
        ps.println("Bank neve: " + name);
        for (Customer c : customers) {
            ps.println(c.toString());
        }
    }

    public void printCustomersToStdout() {
        printCustomers(System.out);
    }

    public void printCustomersToFile(String filename) {
        try (PrintStream ps = new PrintStream(filename)) {
            printCustomers(ps);
        } catch (FileNotFoundException e) {
            System.err.println("Hiba: Fájl nem található: " + e.getMessage());
        }
    }
}