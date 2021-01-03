package day15_Scanner;

import java.util.Scanner;

public class Scanner_int {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Scanner object called scanner
        System.out.println("Enter number one:");
        int numOne = scanner.nextInt(); // reading an int number
        System.out.println("Enter number two:");
        int numTwo = scanner.nextInt(); // reading an int number

        System.out.println("Number one: "+numOne);
        System.out.println("Number two: "+numTwo);
        System.out.println("Sum "+(numOne+numTwo));

        // all the above are print statements using the variable we have used before






    }




}
