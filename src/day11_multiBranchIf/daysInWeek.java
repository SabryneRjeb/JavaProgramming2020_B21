package day11_multiBranchIf;

public class daysInWeek {
    public static void main(String[] args) {
        int number = 2;
        String day = " ";
        if ( number == 1){
            day = "Monday";
        }else if(number == 2){
            day = "Tuesday";
        }else if (number== 3){
            day = "Wednesday";
        }else if (number == 4){
            day = "Thursday";
        }else if(number == 5){
            day = "Friday";
        }else if (number == 6){
            day = "Saturday";
        }else{
            day ="Sunday";
        }

        System.out.println(day);

        System.out.println("=========================");

            String day02 = ( number == 1)? "Monady":(number == 2)? "Tuesday":(number== 3)?"Wednesday":(number == 4)?"Thursday":(number == 5)?"Friday":(number == 6)?"Saturday": "Sunday";


        System.out.println(day02);




    }




}
