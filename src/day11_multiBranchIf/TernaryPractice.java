package day11_multiBranchIf;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class TernaryPractice {

    public static void main(String[] args) {

        int n = 100;
        String result1 = "";
        if(n%2==0){
            result1 = "Even";
        }else{
            result1 = "ODD";
        }
        System.out.println(result1);

        System.out.println("=======================");

        String result2 = (n%2 == 0) ? "Even" : "Odd";
        System.out.println(result2);


        System.out.println("======================");

         int age = 25;
         String citizen ="USA";
         String eligibleToVote =( age >= 18 && citizen == "USA")? "Eligible to vote" : " Not eligible to vote";


        System.out.println(eligibleToVote);
        System.out.println("======================");


        int number = 1000;
        String s1 = "";
        if (number>0){
            s1="Positive";
        }else if (number<0){
            s1 ="Negatice";

        }else {
            s1 = "zero";

        }
        System.out.println(s1);

        String s2 = (number>0)? "Positive" :(number<0)?"Negative": "Zero";
        System.out.println(s2);
    }
}
