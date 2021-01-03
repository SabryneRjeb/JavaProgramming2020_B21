package day10_If_else_statment;

public class If_Statements {
    public static void main(String[] args) {

        int score =  45;



        // used when you want to create a condition


        if( score >= 60) {

            System.out.println("Congrats");
        }

        if (score < 60){
            System.out.println("Keep trying");
        }


        System.out.println("================================");

        if (score >= 60) {
            System.out.println("Congrats");

        }else{
            System.out.println("keep trying");
        }


          if (score >=60) {
              System.out.println("Congrats");
          }else{
              System.out.println("Come back next year");
          }

         if (score >= 60) {
             System.out.println("Good Job");
         }else{
             System.out.println("Next time");


         }


        System.out.println("======================");

          int angle1 = 80;
          int angle2 = 75;
          int angle3 = 65;
          int angle4 = 75;

          boolean isValidRectangle = angle1 == 90 && angle2== 90 && angle3 ==90 && angle4 == 90;
                             // if each angle is equal to 90 then it's valid

           if(isValidRectangle) {
               System.out.println("It is a valid rectangle");
           }else{ // otherwise   only for 2 possible outcomes
               System.out.println("The rectangle is not valid");
           }


        System.out.println("==================================");

           // assume that a & b are two different numbers
int a = 200;
int b = 1000;
int max = 0;//?
int min = 0;

// what is the maximum number

        if (a > b) {
            max = a;
        }else{
            max = b;
        }
        System.out.println("Maximum number is: "+max);

        if (a < b) {
            min = a;
        }else{
            min = b;
            System.out.println("Minimum number is :"+min);
        }




        }











    }







