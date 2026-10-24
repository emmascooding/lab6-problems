package Problem2;

import java.util.ArrayList;

public class Bank {
    private String name;
    ArrayList<Customer> customers;

    public Bank(String name, ArrayList<Customer> customers) {
        this.name = name;
        this.customers = customers;
    }

    public void addCustomer(Customer customer) {
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
    }

    public void addTransaction(Customer customer, Double amount) {
        for (Customer c : customers) {
            if (c.name.equals(customer.name)) {
                c.newTransaction(amount);
            }
        }
    }

    public void printTransactions(Customer c) {
        for (Customer cust : customers) {
            if (cust.name.equals(c.name)) {
                System.out.printf("Customer name: %s%n", cust.name);
                for (double d : cust.transactions) {
                    System.out.printf("%.2f%n", d);
                }
            }
        }
    }
}
