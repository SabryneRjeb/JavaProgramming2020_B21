package day12_NestedIf;

public class loan_task {
    public static void main(String[] args) {
        double minimumSalary = 50000;
        double jobHistory = 1;
        int creditScore = 550;


        if (minimumSalary>=30000) {
            if(jobHistory >= 2) {
                if (creditScore >= 680) {

                    System.out.println("you are qualified for loan");
                } else {
                    System.out.println("you must be on the job for 2 years");
                }
            }

        }else{
            System.out.println("You must have minimum of 30K salary first");

        }

















    }




}
