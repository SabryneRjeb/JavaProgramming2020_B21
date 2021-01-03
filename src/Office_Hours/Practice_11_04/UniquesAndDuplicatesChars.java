package Office_Hours.Practice_11_04;
import java.util.Scanner;
public class UniquesAndDuplicatesChars {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
        System.out.println("Enter a string");
        //String str = "aabccd";
        // unique characters are 'b','d'; we need to find the frequency of each character
        String unique = "";
        String duplicate="";
        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int frequency = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    frequency++;
                }
            }
            if (frequency == 1) { // if frequency is one, it means character is unique
                unique += ch;
            }
            if(frequency>1){
                // &&!duplicates.contains(""+ch);
                duplicate+=ch;                         // all this is to find one character unique or duplicate
            }

        }
        System.out.println(unique);
        System.out.println(duplicate);




    }
}