package Office_Hours.Practice_11_11_2020;
import java.util.Arrays;
public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[] arr1d = {1,2,3,4};
        // index       0 1 2 3
                        //  0 1 2 3   0 1 2   0 1
        int [][] arr2d = { {1,2,3,4},{5,6,7},{8,9} };
                        // index 0      1      2


        System.out.println(arr2d[2]);
        System.out.println(Arrays.toString(arr2d[2]));
        // int [][] arr2d = { {1,2,3,4},{5,6,7},{8,9} };   to print all the array

        System.out.println(Arrays.deepToString(arr2d));


        System.out.println("=====================================");
        // we can only use for each loop for multidimensional arrays

        for(int[] each1DArray: arr2d){
            System.out.println(Arrays.toString(each1DArray)); // this how we get access to each array

            for (int eachElement :each1DArray){
                System.out.println(eachElement);
            }
            System.out.println("===========================");





            }
        }


    }





