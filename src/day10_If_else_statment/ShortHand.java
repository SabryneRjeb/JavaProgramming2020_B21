package day10_If_else_statment;

public class ShortHand {

    public static void main(String[] args) {
        // = assigning new data without declaring again
        int a = 100;
        System.out.println(a); //100;
        System.out.println(++a); // 101

        a= 200;
        System.out.println(a); // 200
        System.out.println(++a);// 201
        System.out.println(a); // 201

        a = 300;
        System.out.println(a); // 300

        String name = "Daniel";
        System.out.println(name); // Daniel

        name = "John";
        System.out.println(name);

        // +=

        int A = 200;
           // A = A + 100;
        A += 100; // the addition will be assigned to the variable
        System.out.println(A);

        String school = "Cybertek";
             //school = school + " School";
        school += " School"; // concatenation assignment
        System.out.println(school);

             int savingAccount = 1000;

             savingAccount += 2000; // say you added for october
        System.out.println(savingAccount); // october

        savingAccount += 500;// added in November
        System.out.println(savingAccount);

        // -=: decrease the value

        savingAccount -= 1000;
        System.out.println(savingAccount);

        // *=:
        double salary = 100000;
        salary *= 1.2;
        System.out.println(salary);

        int y = 10;
        y *= 10;
        System.out.println(y);

        // /= :
        double tax = 10000;
        tax /= 2;
        System.out.println(tax);
        int B = 3000;
        // B/= 0;
        System.out.println(B);

        // %=: remainder
        /*
        in math
        10/4 = 2.5
        remainder: 10 - (4 * 2) = 2

        in Java: 10 % 4 ==> 2


         */

        int T = 100;
         T %= 10;
        System.out.println(T);

        double U = 35;
        U %= 9;
        /*
        35/9=3.88
        remainder: 35 - (9*3);
         */
        System.out.println(U);


















    }


}
