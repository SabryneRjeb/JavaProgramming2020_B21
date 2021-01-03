package Self_Practice;
import java.util.Scanner;
public class replit_115_findMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int max = nums[0];
        for (int i =1; i< nums.length ; i++){
            if (max< nums[i]){
                max = nums[i];
            }
        }


        System.out.println(max);



    }



}
