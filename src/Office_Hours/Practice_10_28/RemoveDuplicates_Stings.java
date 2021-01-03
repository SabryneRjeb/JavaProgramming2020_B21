package Office_Hours.Practice_10_28;

public class RemoveDuplicates_Stings {
    public static void main(String[] args) {
        String str = "abab";

        String nonDup = "";
        // if the character does not exist in nonDup, then we can concate it

        for(int i= 0; i < str.length();i++){// contain method only accepts string
        String eachChar=""+str.charAt(i);
        if(nonDup.contains(  eachChar )) { // if the character is already contained in nonDup
            continue; // skip it
        }else{
            nonDup+=eachChar;
        }
        }
        System.out.println(nonDup);
    }
}
