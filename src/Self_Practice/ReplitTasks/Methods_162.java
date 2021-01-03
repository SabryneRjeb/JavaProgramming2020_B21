package Self_Practice.ReplitTasks;
import java.util.*;
        public class Methods_162 {
            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                int num = scan.nextInt();
                fib(num);
            }
            public static void fib(int num){
                //WRITE YOUR CODE HERE
                int sum = 1;
                int i =1, j =1, k = 1 ;
                while (i<=num-2) {
                    sum = j+k;
                    j =k;
                    k = sum;
                    i++;
                }
                System.out.println(sum);
            }
        }

