package day34_ArrayList;

import java.util.ArrayList;
public class WarmupTasks {
    public static void main(String[] args) {

        /*
        warmup tasks:
    1. write a program that can set the last element of the Integer arraylist to zero
            ex:
                list = [1,2,3,4,5];
                output: [1,2,3,4,0];
    2. write a program that can multiply each odd number by 2
            ex: list = [1,2,3,4,5];
                output: [2,2,6,4,10]

         */

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(30);
        numbers.add(1, 40);

        System.out.println( numbers );

        numbers.set(numbers.size()-1, 0 );

        System.out.println(numbers);

        numbers.clear();

        System.out.println( numbers.isEmpty() );

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(numbers);

        for(int i =0; i <= numbers.size()-1; i++){
            int each = numbers.get(i);  // unboxing
            if(each%2 != 0){
                numbers.set(i, each*2);
            }
        }

        System.out.println(numbers);

        System.out.println("============================================================");

        int[] scores = {65, 75, 77, 85, 68, 88, 82, 72, 95, 99, 98};

        ArrayList<Integer> AList = new ArrayList<>();
        ArrayList<Integer> BList = new ArrayList<>();
        ArrayList<Integer> CList = new ArrayList<>();
        ArrayList<Integer> DList = new ArrayList<>();
        ArrayList<Integer> FList = new ArrayList<>();

        for(int each : scores ){
            if(each >= 90){
                AList.add(each);
            }else if(each >= 80){
                BList.add(each);
            }else if(each >= 70){
                CList.add(each);
            }else if(each >= 60){
                DList.add(each);
            }else{
                FList.add(each);
            }
        }



    }











    }


