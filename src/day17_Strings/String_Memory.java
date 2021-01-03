package day17_Strings;

public class String_Memory {
    public static void main(String[] args) {

        /*
        strOne--->   String Pool :
                      "java" <--strTwo
                    Heap
                    "java" <-- strThree
                    "java <--strFour

         */

        String strOne = "java"; //literal
        String strTwo = "java"; // literal
        String strThree = new String( "java");
        String strFour = new String( "java");


        System.out.println(strOne== strTwo);  // tru
        System.out.println(strTwo== strTwo); // true
        System.out.println(strThree==strFour); // false




        String strFive = "Java";  // made in the string pool
        System.out.println(strOne == strFive); // false





    }





}
