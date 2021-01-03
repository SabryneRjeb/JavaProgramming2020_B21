package Office_Hours.Practice_11_25;

public class MethodPractice {
    public static void main(String[] args) {
        divisibleBy3Between1To100();
        System.out.println();
        System.out.println("Hello");
        divisibleBy3Between1To100();
        System.out.println("How are you");
        divisibleBy3(50, 90);
        grade(50);
        eligibleToVote(18, true);

    }

    public static void divisibleBy3Between1To100() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0) { //if the number is not divisible by 3
                continue; // then skip

            }
            System.out.print(i + " ");
        }
        System.out.println(); // new line so we don't have to add it manually everytime
// this method return type is void and we fif not pass any paramater
    }

    public static void divisibleBy3(int start, int end) {
        if (end <= start) {
            System.out.println("Invalid Numbers");
            return;  // return is to exit the current method
            // System.exit: will exit the whole program will be terminated
        }
        for (int i = start; i <= end; i++) {
            if (i % 3 != 0) { //if the number is not divisible by 3
                continue; // then skip

            }
            System.out.print(i + " ");
        }
        System.out.println(); // new line so we don't have to add it manually everytime


    }


/*
A: Excellent
B: Great
C: Good
D: Passed
F: Failed
 */

    public static void grade(int score) {
        if (score < 0 || score > 100) {
            System.out.println("Invalid Score");
            return;
        }
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
        switch (grade) {
            case "A":
                System.out.println("Excellent, you made an A");
                break;
            case "B":
                System.out.println("Great, you made a B");
                break;
            case "C":
                System.out.println("Good, you made a c");
                break; // exits the statement when the condition is true
            case "D":
                System.out.println("You Passed");
                break;
            default:  // default gets executed if none of the cases above are true
                System.out.println("You Failed");

        }


    }  // calculating the student grade


    public static void eligibleToVote(int age, boolean isUsCitizen){
        if(age<18){
            System.out.println("You must be at least 18 years old");
            return;
        }
        if(isUsCitizen == false){
            System.out.println("You must be US Citizen to vote");
            return; // it exits the current method otherwise it will print the next statement
        }
        System.out.println("You are eligible to vote");
    }










}
