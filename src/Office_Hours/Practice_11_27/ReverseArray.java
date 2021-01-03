package Office_Hours.Practice_11_27;
import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        int [] arr ={10,20,30,40};  // length = 4
                //   0  1   2  3
        System.out.println(Arrays.toString(arr));
        int [] reverse = new int[arr.length];
        //     j++      i--
      /*
      reverse[0] =  arr[3];
        reverse[1] = arr[2];
        reverse[2]= arr [1];
        reverse [3] = arr[0];

       */

    System.out.println(Arrays.toString(reverse));

        for(int i = arr.length-1, j=0; i>=0; i--,j++){
            reverse[j] =  arr[i]; // i : index number of arr in reversed order
                                //  J: index numbers of reverse array, in natural order
        }

        System.out.println(Arrays.toString(reverse));
    }



}
