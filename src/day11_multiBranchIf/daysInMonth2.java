package day11_multiBranchIf;

public class daysInMonth2 {

    public static void main(String[] args) {
        int month = 10; // 1 to 12
        boolean has28Days = month == 2;
        boolean has30Days = month == 4 || month == 6 || month == 9 || month == 11;
        boolean has31Days = !has28Days && !has30Days;

        int days = 0 ;

        if(has28Days){
            days = 28;
        }
        if(has30Days){
            days = 30;
        }
        if(has31Days){
            days = 31;
        }
        System.out.println(days + " days ");

        System.out.println("===========================");

             if (has28Days) {
                 System.out.println("28 days");

             }else if (has30Days) {

                 System.out.println("30 days");
             }else{
                 System.out.println("31 days");
             }

        System.out.println("==================");

             int days2 = (has28Days) ? 28 :(has30Days)? 30 : 31;

        System.out.println(days2);




    }





    }





