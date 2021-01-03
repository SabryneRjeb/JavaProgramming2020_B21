package Self_Practice;
import java.util.Scanner;
public class secondsConverter {
    public static void main(String[] args) {



        Scanner object = new Scanner(System.in);

        System.out.println("Enter seconds:");

        int inputSeconds = object.nextInt();

       int  hours = inputSeconds /60 / 60;
       int minutes= inputSeconds / 60 %60;
       int  seconds = inputSeconds %60 %60 %60;

        System.out.println(hours+"hours, "+minutes+"minutes, "+seconds+"seconds");






    }






}




