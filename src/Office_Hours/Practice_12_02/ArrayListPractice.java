package Office_Hours.Practice_12_02;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
       list1.addAll(Arrays.asList(10,20,30,40,50,60,70) ); // size is 7
        // internally uses array  0  1  2  3  4  5  6

        System.out.println(list1.isEmpty()); // false because it is not empty
        int lastIndex = list1.size()-1;  // to find the length we use size

        // get method is to retrieve the elements in the array list

       int n1= list1.get(lastIndex);
        System.out.println(n1);
        //if we want to replace the 40 to 400 we will call the set method - it's like substring
        list1.set(3,400);  // we need to place the index number of what we are changing
        System.out.println(list1);

        // Array List is collection type that does not accept primitives

        Integer [] arr2 ={100,200,300,400,500,600};
        list1.addAll(Arrays.asList(arr2));   // to convert array to arraylist for non primitive only
        System.out.println(list1);

        // we would use the for each loop to convert array if int to arrayList

        int[] arr3 ={1000,2000,3000,4000};
        for(int each:arr3) list1.add(each);  // for primitive elements
        System.out.println(list1);

        System.out.println(list1.contains(10000));  // boolean to verify if the element is contained

        System.out.println(list1.indexOf(1000)); // another way to check if element exists in the list


            list1.clear();
            list1.addAll(Arrays.asList(-1,-2,-3,-4,-5) );
        System.out.println(list1);

        ArrayList<Integer> list2 =new ArrayList<>();
        list2.addAll(Arrays.asList(-1,-2,-3,-4,-5));

        System.out.println(list2);
        System.out.println(list1==list2); // == going to check the memory location -

        System.out.println(list1.equals(list2)); // e   quality of two array lists

        ArrayList<Integer>list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(-1,-2,-3,-4,-5));

        System.out.println(list2.equals(list3));  // is going to compare the elements in their index number

        Collections.sort(list2);
        Collections.sort(list3);                 // to verify if two array lists are made of the same elements
        // this sort method will sort the list in ascending order
        System.out.println(list2.equals(list3));



    }



}
