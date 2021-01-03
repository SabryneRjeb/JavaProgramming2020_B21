package Office_Hours.Practice_11_04;
import java.util.Scanner;
public class FrequencyOfSingleChar {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scan.next();

        System.out.println("Enter a character");
        char ch= scan.next().charAt(0);
        int frequency=0;
            scan.close();
        for(int i = 0; i<str.length();i++) {
            if (str.charAt(i) == ch ){ // if the character is matched with the characters of the string
                frequency++;

            }
        }

        System.out.println(frequency);






    }

}
