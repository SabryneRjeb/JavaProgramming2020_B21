package day06_Arithmatic_operators;

public class Salaryy_calculator {


    /*

    Task01: SalaryCalculator
    variables: salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax
                100000    0.08         0.21
    output:
        Your salary is: YourSalary
        Your State Tax: YourStateTax
        Your federal Tax: federalTax
        your total tax: TotalTax
        your salary after tax: YourSalaryAfterTax

      */


    public static void main(String[] args) {

        int salary = 10000;
        double stateTax = salary * 0.08;
        double federalTax = salary* 0.21;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salary - totalTax;
        System.out.println("My salary is: "+salary);
        System.out.println("My state tax is: "+stateTax);
        System.out.println("My federal tax is:"+federalTax);
        System.out.println("My total tax is:"+totalTax);
        System.out.println("My salary after tax is: "+salaryAfterTax);





    }










}
