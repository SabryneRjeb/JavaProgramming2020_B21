package day04_Variables;

public class Salary_calculator {
    /*

    SalaryCalculator
    write a program that can calculate the salary after tax based on the salary and tax rate
            Ex:
                if salary = 100000
                   tax = 0.28
                   salary after tax = 72000
             Total tax: Salary * Tax rate
             salary after tax : salary - total tax
     */


    public static void main(String[] args) {
        // Salary: 10000  Tax rate:0.28

        int Salary = 10000; // whole numbers for int
        double Taxrate = 0.28; // decimal numbers for double
        double Totaltax = Salary * Taxrate;
        double SalaryafterTax = Salary - Totaltax;

        System.out.println("You Salary after tax = ");
        System.out.println(SalaryafterTax);
        System.out.println("Your Total Tax pais is : ");
        System.out.println(Totaltax);





    }




}
