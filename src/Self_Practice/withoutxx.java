package Self_Practice;
import java.util.Scanner;
public class withoutxx {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.substring(0, 1).equalsIgnoreCase("X")){
            word = word.substring(1);
        }
        int lastCharIndex = word.length()-1;
        String lastCharStr = word.substring(lastCharIndex);

        if (lastCharStr.equalsIgnoreCase("x")){
            word= word.substring(0,lastCharIndex);
        }




    }
}