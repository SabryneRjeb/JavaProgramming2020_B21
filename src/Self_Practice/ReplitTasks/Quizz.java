package Self_Practice.ReplitTasks;
import java.util.Arrays;
import java.util.ArrayList;


public class Quizz {

    public static void main(String[] args) {
      double number = add(3.4);
      number+= add("dual");
      number += add(Integer.parseInt("100"));
      number += add(11341L);
      number+= add(Float.parseFloat("50.8"));
        System.out.println(number);

    }
public static int add(int n){
        return 5;
}
   public static double add (double d){
        return 2.5;
   }
   public static long add(String s){
        return 10;
   }
}