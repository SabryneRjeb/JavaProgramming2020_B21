package day32_LocalDate_WrapperClass;
import java.time.LocalDate;
public class Date {
    public static void main(String[] args) {
        LocalDate yesterday = LocalDate.of(2020,11,22);

        System.out.println(yesterday);

       // LocalDate d1 = LocalDate.of(2020,2,29);
       // System.out.println(d1);


        System.out.println(yesterday.isLeapYear()); // Leap==> true, otherwise==> false


       LocalDate today = LocalDate.now(); // now is for today's date
        System.out.println(today);

        LocalDate DofB = LocalDate.of(1991,05,02);
        System.out.println(DofB);
        System.out.println(DofB.isLeapYear());



    }

}
