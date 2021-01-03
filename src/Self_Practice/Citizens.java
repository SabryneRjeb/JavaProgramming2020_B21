package Self_Practice;
import java.util.Scanner;
import java.util.Scanner;
public class Citizens {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter current count for SeniorCitizens and nonSeniorCitizens:");

     int SeniorCitizen = input.nextInt();
     int NonSeniorCitizen = input.nextInt();


        System.out.println("What is new citizen's age");

        int age = input.nextInt();

        if (age>= 65){
            SeniorCitizen++;
            System.out.println("Senior citizen");
        }else{
            NonSeniorCitizen++;
            System.out.println("Non-Senior Citizen");
        }

        System.out.println("New seniorCitizens"+SeniorCitizen);
        System.out.println("New nonSeniorCitizens"+NonSeniorCitizen);




    }







}
