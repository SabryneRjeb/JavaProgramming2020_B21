package Self_Practice;
import java.util.Scanner;
public class Shopping_List {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        System.out.println("Enter Item1 and its price:");
        String item1 = input.next();
        double price1 = input.nextDouble();

        System.out.println("Enter Item2 and its price:");
        String item2 = input.next();
        double price2 = input.nextDouble();

        System.out.println("Enter Item3 and its price:");
        String item3 = input.next();
        double price3 = input.nextDouble();

        String report = ("Item1: "+item1+" Price: "+price1+","+" Item2: "+item2+" Price: "+price2+","+" Item3: "+item3+" Price: "+price3);
        double totalPrice = price1+price2+price3;

        System.out.println(report);
        System.out.println("Total price i: "+totalPrice);












    }







}
