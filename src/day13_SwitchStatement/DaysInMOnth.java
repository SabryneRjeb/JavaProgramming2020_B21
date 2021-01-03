package day13_SwitchStatement;

public class DaysInMOnth {
    public static void main(String[] args) {
        /*
        write a program that can find the number of days in a month
        Note : MUST USE NESTED IF

         */


        int year = 2020;
        int month = 9; // 1 ~ 12
        String result= "";
        boolean has30Days = month == 4 || month==6 || month ==9 || month==11;
        boolean has28or29Days = month == 2;
        // boolean has31Days = !has30Days || !has28or29Days;



        if (month>0 && month<13){   // between 1 and 12
            if (has28or29Days){ // of Feb
                if(year%4 == 0){  // Leap year
                    result = "29 days";
                }else{ // not leap year
                    result ="28 days";
                }
            }else if(has30Days){ // for April , June, September, November
                result = "30 days";
            }else{ // for Jan, March, May, July,August,October,December
                result = "31 days";
            }


        }else{  // if the month is invalid
            result = "Invalid Month";
        }


        System.out.println(result);






    }








}
