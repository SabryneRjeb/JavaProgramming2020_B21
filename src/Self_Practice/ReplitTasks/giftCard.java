package Self_Practice.ReplitTasks;
import java.util.Scanner;
public class giftCard {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
         String item = input.nextLine();

        int price = 0;
        switch (item) {

            case "Smartphone":
                price = 300;
                break;
            case "Laptop":
                price = 400;
                break;
            case "Charger":
                price = 15;
                break;
            case "USB cable":
                price = 10;
                break;
            case "Headphones":
                price = 30;
                break;
            case "Pants":
                price = 50;
                break;
            case "Hat":
                price = 25;
                break;
            case "Socks":
                price = 5;
                break;
            case "Blanket":
                price = 60;
                break;
            case "Pillow":
                price = 40;
                break;

        }

        if (price <= 100 && price>0) {
            int change = 100 - price;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + change + "$");
        }else if (price>100){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else{
            System.out.println("Invalid item!");
        }







    }
}
