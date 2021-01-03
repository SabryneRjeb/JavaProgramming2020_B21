package Office_Hours.Practice_10_28;

public class FrequencyOfACharacter2 {
    public static void main(String[] args) {
        String str = "abababababa";
        char ch ='a';

        int count=0;

        while(str.contains(""+ch)){
            str=str.replaceFirst(""+ch,"" );
            count++;
        }
        System.out.println(count);

    }

}
