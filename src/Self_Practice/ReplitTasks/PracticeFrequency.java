package Self_Practice.ReplitTasks;

public class PracticeFrequency {
    public static void main(String[] args) {
        String str = "AABBBCCCDDDDEEFFF";
        String result ="";


        for(int j= 0; j<str.length();j++){
            char character = str.charAt(j); // intialize the first char we need to find

            int count =0;
            for(int i=0; i<str.length();i++) { // loop through the str
                char each = str.charAt(i);
                if(each == character){ // if each charater eqyals to charAt(0)
                    count++; // counting how many charAt(0) we have
                }

            }
            if(result.contains(character+"")){
                continue;
            }else{
                result+=""+character+count;
            }

        }

        System.out.println(result);


    }




}
