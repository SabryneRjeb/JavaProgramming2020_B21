package day13_SwitchStatement;

public class SwitchStatement_1 {
    public static void main(String[] args) {

        switch (2)  {                         // cannot be boolean can only be data

            case 1:
                System.out.println("one");
                break;

            case 2 :
                System.out.println("Two");
                break; // is the closing statement for each case

            case 3:
                System.out.println("Three");
                break;

            default:// dont need any data - it always works
                System.out.println("Invalid Case");

                break;
                // default can be placed anywhere but it is preferred to be placed at the end
        }





    }




}
