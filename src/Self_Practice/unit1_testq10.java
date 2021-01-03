package Self_Practice;


public class unit1_testq10 {
    public static void main(String[] args) {


        boolean one = ('a' != 'z') && false;
        boolean two = one || 0 == (9 - 10 + 1);
        System.out.println(two);


        long l = 100;
        short s = (short) l;
        System.out.println(s+10);



        int a = 10;
        a= --a + a++ + a-- + a++;
        System.out.println(a);



        short F = 13 + 3 * (10-6) % 2;
        boolean b = F != 25;
        System.out.println(b);


         byte m = 104;
         boolean check = m < 100;

         if (check){
             m -= 100;
         }else{
             m = 50;
         }
        System.out.println(m);



    }

}
