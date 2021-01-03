package day04_Variables;

public class calculate_Circle {
    /*

    Task03: CalculateCircle
     write a program that can calulate the area and permeter of the circle based on the given radius
        Hints: Area of circle = r * r * PI
              Perimeter of circle = 2 * r * PI

        */


    public static void main(String[] args) {
        // radius= r = 7.5

       double r = 7.5;
       double pi = 3.14;
       double area = r * r * pi;
       double perimeter = 2 * r * pi;



        System.out.println("Area is: ");
        System.out.println(area);
        System.out.println("Perimeter is: ");
        System.out.println(perimeter);




    }







}
