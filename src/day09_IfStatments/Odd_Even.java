package day09_IfStatments;

public class Odd_Even {
    public static void main(String[] args) {
        /*
        task:
    1. write a program that can check if the given number is odd or even
        Ex:
            number = 100;
            output:
                100 is even number
            number = 101
            output:
                101 is odd number






         */

int num = 200;
boolean even = num %2== 0;
boolean odd = !even;

if (even) {
    System.out.println(num+" is even number");
}
if(odd) {
    System.out.println(num+" is odd number");
}


}


}


















