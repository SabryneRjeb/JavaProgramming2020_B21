package day30_returnMethods;
import java.util.Arrays;
public class WarmUpTasks {
    public static void main(String[] args) {
        positiveNegativeZero(123); // just pass the argument when passing the method
        positiveNegativeZero(0);
        positiveNegativeZero(-10);
        System.out.println("===================================");
        int[] numbers = {1, 2, 3, 4, -5, -6, -7, -8, 10, 11, 0};

        for(int i =0; i <= numbers.length-1; i++){
            positiveNegativeZero( numbers[i] );
        }

    }
    // tasl1:
    public static void positiveNegativeZero(int number){

        String result = (number > 0)? "Positive": (number<0)? "Negative":"Zero";
        System.out.println(result);
        System.out.println(number+"is"+result);

    }



    // task2:     // void prevents returning data
    public static void   gradeCalculator (int score){

        if (score >= 0 && score <= 100) {
            /*
            if (score >= 90) {
                System.out.println("A");
            } else if (score >= 80) {
                System.out.println("B");
            } else if (score >= 70) {
                System.out.println("C");
            } else if (score >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
             */
            System.out.println( (score>= 90)? 'A' :(score>=80)? 'B' :(score>=70)? 'C' :(score>=60)?'D':'F' );

        } else {
            System.err.println("Invalid Score");
        }
    }

    // task3:                               {1,2}       {3,4,5}
    public static void combineTwoArrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length+arr2.length];
        int i = 0;  // represents the index nums of arr3

        for(int each : arr1){
            arr3[i++] = each; // each elements of arr1 is being assigned to the index of third array
        }

        // i= 2
        for(int each : arr2){
            arr3[i++]  = each; // each elements of arr2 is being assigned to the index of third array
        }

        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3) );

    }



    // task4:                           "aabccb"
    public static void removeDuplicates(String str){
        String result = "";  //"abc"
/*
        for(char each : str.toCharArray() ){  //each: [a, a, b, c, c, b]
            if(!result.contains( ""+each )){
                result += each;
            }
        }
 */

        for( int i = 0; i <= str.length()-1; i++  ){
            if(!result.contains( ""+str.charAt(i) )){
                result += str.charAt(i);
            }
        }

        System.out.println( result);
    }





}







 /*
   1. create a function that can check if the given integer is positive, negative or zero
    2. create a function that can calculate the garde of the student
    3. create a function that can print out the combination of two integer arrays
    4. create a function that can print a string without the duplicated characters
    5.  write a method that can print out the full name of a person in reugral format
    ex:
    fullName("cYbErTeK", "SCHOOL");
    output:
            "Cybertek School"
*/

