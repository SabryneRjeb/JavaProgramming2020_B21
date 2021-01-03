package Self_Practice;
import java.util.Scanner;
public class VendingMachine {
    public static void main(String[] args) {



        Scanner object = new Scanner(System.in);

        int itemPrice = object.nextInt();

        int nickels = 5;
        int dimes = 10;
        int quarters = 25;
        int change = 100-itemPrice;
        int quartersC = change/25;
        int dimesC = (change%25)/10;
        int nickelsC = ((change%25)%10)/5;

        System.out.println("Enter price in cents:");


        if(itemPrice>=25 && itemPrice<=100 && itemPrice%5==0){

            System.out.println("Your change is "+quartersC+"quarters"+dimesC+"dimes"+nickelsC+"nickels");
        }else{
            System.out.println("Invalid price!");

        }







    }





}
