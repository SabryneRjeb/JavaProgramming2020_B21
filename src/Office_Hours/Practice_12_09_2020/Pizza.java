package Office_Hours.Practice_12_09_2020;

public class Pizza {
    public String size;
    public int cheeseTopping, pepperoniTopping;
    public double priceOfPizza, tips, totalPrice;


    public void customizeOrder(String size, int cheeseTopping, int pepperoniTopping, double tips){
        this.size = size;
        this.cheeseTopping = cheeseTopping;
        this.pepperoniTopping = pepperoniTopping;

        priceOfPizza= calcCost(); // we dont have to use This keyword because priceofpizza in not used in the paramater
        // we assigned it to the method that we created to calculate the price

        //tips = tips/100;  // we split by 100 to convert it to decimal
        this.tips=tips/100 * priceOfPizza; // this step is to reassign the new tips to the original instance variable
// if the tips are entered in percentage then we multiply it by price of pizza
        totalPrice = priceOfPizza+this.tips;

    }

    public double calcCost(){
        double startingPrice = (size.equalsIgnoreCase("small")) ?10
                :(size.equalsIgnoreCase("medium"))? 12 : 14;
        double cheese = 1 * cheeseTopping;
        double pepperoni = 1.5 * pepperoniTopping;

        return startingPrice+cheese+pepperoni; // this method can calculate the price of the pizza
    }

    public String toString() {
        return "PizzaTask{" +
                "size='" + size + '\'' +
                ", cheeseTopping=" + cheeseTopping +
                ", pepperoniTopping=" + pepperoniTopping +
                ", priceOfPizza=" + priceOfPizza +
                ", tips=" + tips +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
