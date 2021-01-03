package Office_Hours.Practice_12_02;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class SecondMax_SecondMin {

    public static void main(String[] args) {
        // find second maximum number from the array list
        // 2- find second minimum number // //  not allowed to use the sort method



        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,1,1,2,3,4,5,6,7,8,9,10,18,10));
       list.removeAll(Arrays.asList(Collections.max(list), Collections.min(list)) );
        // removes all the maximum numbers

        // if i call this method again it will give me the second maximum

        int secondMax = Collections.max(list);
        int secondMin = Collections.min(list);
        System.out.println("SecondMax ="+secondMax);
        System.out.println("SecondMin = "+secondMin);
// we first remove the first max number than the next max number will be the second max
        // the same goes for min number
        System.out.println("==================================================");




    }

}
