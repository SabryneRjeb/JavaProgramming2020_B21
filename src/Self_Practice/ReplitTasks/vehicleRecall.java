package Self_Practice.ReplitTasks;
import java.util.Scanner;
public class vehicleRecall {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);

        System.out.println("Enter vehicle's year:");
        int modelYear = object.nextInt();

        if (modelYear>=1995 && modelYear<=1998 || modelYear>=2004 && modelYear<=2006
        || modelYear>=2015 && modelYear<=2017){
            System.out.println("Your vehicle needs to be recalled!");
        }else{
            System.out.println("Your vehicle is fine, enjoy!");
        }









    }







}
