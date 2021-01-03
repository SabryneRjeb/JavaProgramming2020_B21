package Office_Hours.Practice_11_11_2020;

public class ArraysPractice2 {
    public static void main(String[] args) {
// how many words are matching(first and last character)

        String[] word = {"Anna","Level","Lol","Donald","Biden","Aamir","Agalar","Engin"};

        int count = 0;
        for(String each:word){
            char firstChar = each.toLowerCase().charAt(0); // A ==> a
            char lastChar = each.toLowerCase().charAt(each.length()-1); //a

            if(firstChar==lastChar){
                count++;
            }


        }
        System.out.println(count);



    }




}
