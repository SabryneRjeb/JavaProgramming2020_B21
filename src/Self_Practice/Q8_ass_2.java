package Self_Practice;

public class Q8_ass_2 {
    public static void main(String[] args) {
        String s  = "the game was tied at 2-2";
        String s2 = s.substring(5);
        System.out.println(s2);

        int index1 = s.indexOf("game");
        int index2 = s2.indexOf("game");
        System.out.println(index1);
        System.out.println(index2);


    String z ="popcorn";
        z =z.substring(1,3);
        System.out.println(z);

        System.out.println("===========================");
        int number =5;
        while(number < 100){
            number= number+number;
        }

        System.out.println(number);


    }



}
