package Self_Practice.ReplitTasks;
import java.util.Scanner;
public class ShoppingList_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        System.out.println("Enter Item1 and its price: ");
         item = scan.nextLine();
         price = scan.nextDouble();
         totalPrice += price;
         shoppingListReport ="Item"+count+": "+item+"price"+price;
         do{
             System.out.println("Add one more item?");
             countinue = scan.next();
             if(countinue.equalsIgnoreCase("no")){
             break;
         }
        count++;

        System.out.println("Enter Item"+count+" and its price:");
        item = scan.next();
        price = scan.nextDouble();
        shoppingListReport+=", Item"+count+": "+item+" Price: "+price;
        totalPrice+=price;

    }while(countinue.equalsIgnoreCase("yes") && count<=10);


        System.out.println(shoppingListReport);
	     System.out.println("Total price: "+totalPrice);






    }



}
