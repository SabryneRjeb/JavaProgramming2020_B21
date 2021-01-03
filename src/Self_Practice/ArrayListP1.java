package Self_Practice;
import java.util.ArrayList;
public class ArrayListP1 {
    public static void main(String[] args) {

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("Egg");
        groceryList.add("Water");
        groceryList.add("Milk");
        groceryList.add("Bread");

        groceryList.add(0,"Toilet Paper");
        groceryList.add(1,"Sanitizer");
        groceryList.add(1,"N95 masks");


        System.out.println(groceryList);


        String item1 = groceryList.get(2);
        System.out.println("item = "+item1);


        System.out.println(groceryList.get(groceryList.size()-1));


        System.out.println("============================");

        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for (int i = 1; i<=100;i++){
            if (i%2!=0){
                odd.add(i);
            }else{
                even.add(i);
            }
        }

        System.out.println("odd:"+odd);
        System.out.println("Even:"+even);


        System.out.println("Last odd number:"+odd.get(odd.size()-1));
        System.out.println("Last even number:"+even.get(even.size()-1));
    }


}
