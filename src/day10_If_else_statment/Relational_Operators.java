package day10_If_else_statment;

public class Relational_Operators {
    public static void main(String[] args) {

        // only used for boolean
        // data must be same type

        int a1 = 20;
        int a2 = 30;
        int a3 = 30;

        System.out.println(a1==a2);// false
        System.out.println(a2 == a3); //true

        char ch1 = '!';
        char ch2 = '!';

        System.out.println(ch1 == ch2); // true

        String language1 = "Turkish";
        String language2 = "Indian";
        String language3 = "turkish";

        System.out.println(language1 == language2); //false
        System.out.println(language1 == language3); // false ( case sensitive)
        System.out.println("Russina" == "English");

// != opposite of equal

        System.out.println("Russian Languae" != "Japanese Language"); // true
        System.out.println("Russian Language" == "Japanese Language"); // false

        System.out.println(20 != 20); // false
        System.out.println('a'!= 'A'); // true (case sensitive)









    }







}
