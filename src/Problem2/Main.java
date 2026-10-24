package Problem2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Double> t1 = new ArrayList<>();
        ArrayList<Double> t2 = new ArrayList<>();
        ArrayList<Customer> customers = new ArrayList<>();
        Customer customer1 = new Customer("Emma", t1);
        Customer customer2 = new Customer("Sara", t2);
        Bank bank = new Bank("Bank1", customers);
        bank.addCustomer(customer1);
        bank.addTransaction(customer1, 20.0);
        bank.addTransaction(customer1, 30.0);
        System.out.println("Affichage des transaction du premier client:");
        bank.printTransactions(customer1);

    }
}
