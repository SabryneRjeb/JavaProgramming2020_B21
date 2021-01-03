package Office_Hours.Practice_10_28;

public class FrequencyOfACharacter {
    public static void main(String[] args) {
        String str="aaaaabbccddaaa";
        char ch = 'a';
        int count =0;
        for (int i=0; i<=str.length()-1;i++){ // or i< str.length()
            char eachChar = str.charAt(i);
            if(eachChar == ch ){
                count++;
            }
        }
        System.out.println(count);  // fiding frequency of a single character


    }
}
