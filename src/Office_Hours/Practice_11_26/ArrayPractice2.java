package Office_Hours.Practice_11_26;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        String sentence ="Today is a great day to celebrate the thanks giving by doing Java tasks";

        // to reverse the sentence we need to access every word

       String [] words = sentence.split(" ");
        System.out.println(sentence);
      //  System.out.println(Arrays.toString(words));

        String result = "";
        for(int i = words.length-1; i>=0;i--){
           result+=words[i]+" ";

        }

        result = result.trim();
        System.out.println(result);
        System.out.println("==================================");

        int [] arr1 = new int[3]; // size 3
        int [] arr2 = {1,2,3,4,5}; // size is 5

        arr1 = arr2;

        System.out.println(Arrays.toString(arr1));




    }



}
