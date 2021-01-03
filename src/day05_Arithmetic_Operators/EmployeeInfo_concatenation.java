package day05_Arithmetic_Operators;

public class EmployeeInfo_concatenation {

    public static void main(String[] args) {



        String firstName = "John"; //"" for the texts
        String lastName = "Doe";
        String fullName = firstName+ " "+lastName;
        char gender = 'M'; // '' single quote is for 1 single character
        int age = 35;
        String companyName = "Capital one";
        String jobTitle = "SDET";
        double salary = 120000;
        boolean isFullTime = true;
        boolean isMarried = false;

        System.out.println("Employee' full name:"+ fullName);
        System.out.println(fullName+"'s gender is: "+gender);
        System.out.println(fullName+"'s age is: "+age+" years old");
        System.out.println(fullName+"'s company is:"+companyName);
        System.out.println(fullName+"'s position is:"+jobTitle);
        System.out.println(fullName+"'s salary is: $ "+salary);
        System.out.println(fullName+" is full time = "+isFullTime);
        System.out.println(fullName+" is married = "+isMarried);














        /*




        1. create a class named EmployeeInfo
                declare the following variables:
                    firstName, lastName, gender, age, companyName, jobTitle, isFullTime, isMarried, salary
            write a program that can display the full info of the employee
                    ex:
                             firstName = John
                             lastName = Daniel
                             gender = M
                             age = 35
                             companyName = CapitalOne
                             jobTitle = SDET
                             isFullTime = true
                             isMarried = false
                             salary = 120000.50

             output:
                        Employee' full name is: John Daniel
                        John Daniel' gender is: M
                        John Daniel' age is: 35 years old
                        John Daniel works at: CapitalOne
                        John Daniel' Job title is: SDET
                        John Daniel' salary is 120000.5 $
                        John Daniel is full time employee: true
                        John Daniel is married: false





 */





    }





}
