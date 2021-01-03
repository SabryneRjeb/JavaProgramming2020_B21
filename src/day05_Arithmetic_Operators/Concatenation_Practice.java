package day05_Arithmetic_Operators;

public class Concatenation_Practice {

    public static void main(String[] args) {
        int houseNumber = 1234;
        String streetName = "Johns dr";
        String cityName = "Fairfax";
        String state = "Va";                        // \n is used for a new line inside the code
        int zipcode = 22000;
        String fullAddress = houseNumber+" "+streetName+"\n "+cityName+","+state+","+zipcode;
        System.out.println(fullAddress);

        System.out.println("==============================================");

        String brand = "Toyota";
        String model = "Camry";
        int year = 2010;
        int mileage = 55000;
        double price = 18000;
        String color = "Red";
        // 2010 Toyota Camry, 55000 miles, Red, $18000

        String carInfo = year+" "+ brand+" "+model+", "+mileage+" miles,"+" "+color+", "+" $"+price;
                                       // this is concatenation


        System.out.println(carInfo);

























    }




}
