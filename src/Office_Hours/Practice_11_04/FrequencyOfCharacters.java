package Office_Hours.Practice_11_04;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "abbacaa";
        String result="";

        for(int j=0; j<str.length();j++) {
            char ch = str.charAt(j); // for the characters
            int count = 0; // for the frequency   frequency is the number of time the character is repeated

            for (int i = 0; i < str.length(); i++) {   // to find the frequency of each(one) character by comparing with each character of the string
                if (ch == str.charAt(i)) {
                    count++;
                }
            }
            if(result.contains(""+ch)){   // if the char is repeated in the result that we should skip it by continue;
                continue;
            }
            result += "" + ch + count; // concate string to char otherwise we will get addition
        }
        System.out.println(result);

    }


}
