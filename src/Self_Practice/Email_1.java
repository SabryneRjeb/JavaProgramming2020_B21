package Self_Practice;
import java.util.Scanner;
public class Email_1 {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String email = scan.next();
    if(! email.contains("_")){
        System.out.println(email);
    }else{
        String firstName, lastName;
        int underScore, atIndex;
        underScore = email.indexOf("_");
        atIndex = email.indexOf("@");
        firstName = email.substring(0,underScore);
        lastName = email.substring(underScore+1,atIndex);
        System.out.println(lastName+"_"+firstName+"@gmail.com");

    }



    }


}
