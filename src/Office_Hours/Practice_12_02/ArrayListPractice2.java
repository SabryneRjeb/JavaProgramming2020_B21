package Office_Hours.Practice_12_02;
import sun.jvm.hotspot.types.CIntegerField;

import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListPractice2 {
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('A','A','B','A','C','C','A','2','@','?','#'));

        // remove all 'A' from array list
        list.removeAll(Arrays.asList('A')); // remove if it's matching
        System.out.println(list);

        // only keep 'C' , 'B'

        list.retainAll(Arrays.asList('C','B'));  // retain will remove not matching objects

        System.out.println(list);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(95,85,75,65,55,45,35,45,35,77,97,85));

        // element >= 75 we have to keep
        numbers.removeIf( p-> p <75 );

        System.out.println(numbers);







    }



}
