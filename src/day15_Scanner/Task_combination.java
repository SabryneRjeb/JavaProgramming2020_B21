package day15_Scanner;
import java.util.Scanner;
public class Task_combination {
    public static void main(String[] args) {

        Scanner info =new Scanner(System.in);

        System.out.println("Please enter your age: ");
        byte age = info.nextByte();

        System.out.println("Please enter your favorite number: ");
        long favNum = info.nextLong();

        System.out.println("Are you a student: ");
        boolean isStudent = info.nextBoolean();

        System.out.println("Age: "+age);
        System.out.println("Favorite number is : "+favNum);

        if (isStudent){
            System.out.println("Great don't give up");
        }else{
            System.out.println("Sorry no discount");
        }




    }


}
