package day07_UnaryOperators;

public class Post_Pre {

    public static void main(String[] args) {


        int R = 20;
        int w = -R-- + -R++ + --R * R-- % 2;

        //  -20 + -19 + 19 * 19 % 2
        // -20 + -19 + (19*19) %2
        // -20 + -19 + (361 % 2)
        // -20 + -19 + 1
        // -38

        System.out.println(w);





    }





}
