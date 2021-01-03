package Self_Practice.ReplitTasks;
import java.util.Arrays;
public class test_q23 {
    public static void main(String[] args) {
        int[] nums = new int[5];
        int a=5;

        nums[2]= a--; //5
        nums[0]= a * 2;// 8
        nums[4]= --a + (a-9);
        nums[1]=nums[2];
        nums[3]=nums[a-3];

        System.out.println(Arrays.toString(nums));

    }


}
