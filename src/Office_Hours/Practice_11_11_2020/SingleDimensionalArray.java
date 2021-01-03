package Office_Hours.Practice_11_11_2020;
import java.util.Arrays;
public class SingleDimensionalArray {
    public static void main(String[] args) {

        int [] scores = new int[5];
                        // length = 1
                        // las index = length-1 = 0

        scores[0] = 10;     // index will indicate the order of the array
        scores[1] = 20;
        scores[2]= 50;
        scores[3]= 30;
        scores[4]= 40;

        System.out.println(Arrays.toString(scores)); //[10,20,50,30,40]

        System.out.println(scores[0]);  // to retrieve one element at a time from the array
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);
        System.out.println(scores[4]);
        System.out.println("============================");

        for(int i =0 ; i<scores.length; i++){// variable i represents each index

            System.out.println(scores[i]);
        }

        System.out.println("=============================================");

        for (int each: scores){   // variable each represents the elements
            System.out.println(each);
        }



    }



}
