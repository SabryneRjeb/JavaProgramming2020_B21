package Self_Practice;

public class citizenships {

    /*

    2. write a program that can check if the person is eligible to vote for Donald Trump or Joe Biden
        Ex:
            name = "John"
            citizenShip = "USA"
            output:
                John is eligible to vote for Donald Trump or Joe Biden?
                    true
            name = "Jimmy"
            citizenShip = "Korea"
            output:
                Jimmy is eligible to vote for Donald Trump or Joe Biden?
                    false


     */
    public static void main(String[] args) {

        String name= "Aron";
        String country = "Canada";

        boolean abletovote = country=="usa";

        System.out.println("is "+country+"able to vote:"+abletovote);
        if(abletovote) {
            System.out.println(name + " is eligible to vote ");
        }else{
            System.out.println(name+ " is not eligible to vote");
        }







    }


}

