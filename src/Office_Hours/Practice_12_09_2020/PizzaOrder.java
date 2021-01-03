package Office_Hours.Practice_12_09_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrder {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza();

        pizza1.customizeOrder("small",2,2,20 );

        System.out.println(pizza1);
        System.out.println("====================================");

        // now if I want to order pizza for 175 people

        Pizza[] cybertekPizza = new Pizza[175];
        for (int i =0; i<=cybertekPizza.length-1;i++) {
            Pizza pizza = new Pizza();  // this is one object so far
            pizza.customizeOrder("Medium", 2, 3, 18);

            cybertekPizza[i]= pizza;

        }
        // to calculate the total amount that the store will get
                double total = 0;
            for(Pizza each :cybertekPizza) {   // iterate every object I have
                total+=each.totalPrice;
            }
        System.out.println("Total price "+total);
        System.out.println("==============================");
        ArrayList<Pizza> pizzas = new ArrayList<>();
        for (int i =1 ; i<=60 ; i++){
            Pizza medium = new Pizza();
            medium.customizeOrder("medium",2,3,18);

            Pizza large = new Pizza();
            large.customizeOrder("large",3,4,18);

            Pizza small = new Pizza();
            small.customizeOrder("small",1,1,18);

            // we need to add all the pizzas to the arraylist

            pizzas.addAll(Arrays.asList(small,medium,large));

        }
        System.out.println("Number of Pizza"+pizzas.size()); // size is used to know how many items we have in the array list

        // let's calculate the total price of all different pizza sizes


        double sum = 0;
        for(Pizza eachPizza: pizzas){
            sum +=eachPizza.totalPrice;
        }
        System.out.println(sum);


    }
/*
3:
medium , 2 cheese topping , 3 pepperoni
large: 3 cheese topping, 4 pepperoni
small: 1 cheese topping, 1 pepperoni
 */






}
