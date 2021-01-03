package day10_If_else_statment;

public class Logical_operators {
    public static void main(String[] args) {

        // logical operators: ||, &&, !

        /*
        ||: OR logic returns false if all expressions are false
        if one expression is true than the result is true

      */


        boolean r1 = 10 < 9 || 20 != 20;
                    // false || false
                   // false
        System.out.println(r1);

        boolean r2 = "Muhtar" == "good guy" || "Muhtar" != "Bad guy";
                //            false    || true

               // true (as long as one expression is true ||: will return true)

        System.out.println(r2);

        boolean r3 = 'a' != 'A' || 'B'== 'B';
                   // true || true
        System.out.println(r3);
 // && : return true only if all expressions are true

 boolean r4 = 200 > 100 && 200 < 300;
            // true   && true
        System.out.println(r4);

        boolean r5 = true && false;
                    // false
        System.out.println(r5);
        // !: returns the opposite of the boolean
        System.out.println(!true); // false
        System.out.println(!false); // true








    }









}
