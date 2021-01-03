package Office_Hours.Practice_10_28;
import java.util.Scanner;
public class Reverse_String {
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    String name= scan.nextLine();
       // String name = "Cybertek";
            // Index   01234567
        scan.close(); // to close the scanner
        String result = ""; // "r"

        /* result+= name.charAt(name.length()-1);//result += name.charAt(7);
        result += name.charAt(6);
        result += name.charAt(5);
        result += name.charAt(4);
        result += name.charAt(3);
        result += name.charAt(2);
        result += name.charAt(1);
        result += name.charAt(0);
        System.out.println(result);
   */

        for (int i= name.length()-1; i>=0; i--){

            result+= name.charAt(i);// result = result + name.charAt(i);

            // or we can use result+= name.substring(i,i+1): // gets one character at a time
        }

        System.out.println(result);

    }


}
