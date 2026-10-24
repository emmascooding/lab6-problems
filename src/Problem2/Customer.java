package Problem2;

import java.util.ArrayList;

public class Customer {
    protected String name;
    ArrayList<Double> transactions;

    public Customer(String name, ArrayList<Double> transactions){
        this.name=name;
        this.transactions=transactions;
    }
    public void newTransaction(Double amount){
        transactions.add(amount);
    }
    public boolean equals(Object c){
        if (this == c){
            return true;
        }
        Customer cust = (Customer) c;
        if (this.name.equals(cust.name)){
            return true;
        }
        return false;
    }
}
