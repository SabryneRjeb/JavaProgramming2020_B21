package Self_Practice;
import java.util.Scanner;
public class overdose {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of milligrams in drink:");

        int numberOfMilligrams = input.nextInt();

        int drinkCount = 10*1000;
        int toOverdose = drinkCount/numberOfMilligrams;

        System.out.println("It would take about "+toOverdose+" drinks for a lethal overdose ");









    }


}
