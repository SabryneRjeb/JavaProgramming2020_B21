package day17_Strings;
import java.util.Scanner;
public class Scanner_review2 {
    public static void main(String[] args) {


        /*
        - Place an order
    - Ask the user the enter the product name (String, multiple words)
    - Ask the user to enter the price (double)
    - Ask the user to enter the quantity(int)
    - Ask the user to enter their full name (String, multiple word)
    - Print in the following format:
        "$firstName, your order for $quantity $productName has been placed. Your total is $totalCost(price * quantity)."
    Ex:
        Input: "Apples" , 1.5, 5. "Luke"
        Output: Luke, your order for 5 Apples has been places. Your total is 7.5.
Collapse
 */



        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name");
        String product = input.nextLine();
        System.out.println("Enter the price");
        double price = input.nextDouble();
        System.out.println("Enter the quantity");
        int quantity = input.nextInt();  // we have to hit enter to submit the information
        input.nextLine();  // the enter from above method will be absorbed
        System.out.println("Enter the full name");
        String fullName = input.nextLine();
        System.out.println(product);
        System.out.println(price);
        System.out.println(quantity);
        System.out.println(fullName);















    }



}
