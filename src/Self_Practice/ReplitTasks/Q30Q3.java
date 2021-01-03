package Self_Practice.ReplitTasks;
import java.util.Arrays;
import java.util.ArrayList;
public class Q30Q3 {
    public static void main(String[] args) {


        String [] cities = {"Boston","Houston","Austin","Lincoln","Tusla"};
        ArrayList<String> list = new ArrayList(Arrays.asList(cities));
        int a = list.size();

        for(String str: list){
            String rev = "";

            for(int i = str.length()-1;i>=0;i--){
                rev+=str.charAt(i);
            }
            list.set(--a,rev);


        }
        System.out.println(list);
    }
}
