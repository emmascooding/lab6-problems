package problem1;

import java.util.ArrayList;
import java.util.Scanner;
public class Shop
{
    public static void main (String[] args)
    {
        ArrayList<Item> cart = new ArrayList();
        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        double totalPrice = 0;
        Scanner scan = new Scanner(System.in);
        String keepShopping = "y";
        do
        {
            System.out.println("Enter the name of the item: ");
            itemName = scan.nextLine();
            System.out.println("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.println("Enter the quantity: ");
            quantity = scan.nextInt();
            scan.nextLine();
            item = new Item(itemName, itemPrice, quantity);
            for (Item i : cart){
                System.out.println(i.toString());
                totalPrice += i.getPrice()*i.getQuantity();
            }
            System.out.printf("Total Price: %.2f", totalPrice);
            System.out.print ("Continue shopping (y/n)? ");
            keepShopping = scan.nextLine();
        }
        while (keepShopping.equals("y"));
    }
}
