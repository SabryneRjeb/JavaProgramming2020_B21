package day12_NestedIf;

public class warmup_taskd {





    /*


    armup tasks:
    1.  write a program that can check the equality of the three given numberrs
                declare 3 numbers n1, n2, n3
                if n1 and n2 are equal  => n1&n2 are equal
                if n2 and n3 are equal ==> n2&n3 are equal
                if n3 and n1 are qual ==>n3&n1 are equal
                if all equal ==> all equal
                if none of them are euqal ==> none of them are equal
 */
    public static void main(String[] args) {


        int n1 = 100;
        int n2 = 200;
        int n3 = 100;
        String result = "";

        if (n1 == n2 && n2 == n3);
        {

            // becomes true if all of them are equal

            result = "all equal";

        }if (n1==n2) {// if not all of them are equal but n1 && n2 are equalresult = "n1 & n2 are equal";
        result = "n1 & n2 are equal";
        }else if (n2==n3){
            result = "n2 & n3 are equal";
        }else if (n1==n3){
            result = "n1 & n3 are equal";
        }else {
            result = "none of the are equal";


        }

        System.out.println(result);

        System.out.println("=========================");

        String result2 = (n1==n2)? "n1 & n2 are equal" :(n2== n3)? "n2 & n3 are equal":(n1==n3)?"n1&n3 are equal": "none of them are equal";




    }


}





