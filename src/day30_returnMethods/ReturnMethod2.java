package day30_returnMethods;

public class ReturnMethod2 {
    // void method
    public static void main(String[] args) {
        String names = "racecar";
        // String reverseName =""+reverseStr1(names);  // assign to variable in order to reuse
        // this case is not possible cuz we have a void method that does not return data
        //  String reversedName = reverseStr1(names);

        String reversedName = reverseStr2(names);

        System.out.println(reversedName);

        // boolean isPalindrome = names.equalsIgnoreCase(reversedName);

        //  System.out.println(isPalindrome);


    }

    // void
    public static void reverseStr1(String str){
        String result = "";

        for(int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i);
        }

        System.out.println(result);
    }

    // return method:
    public static String reverseStr2(String str){
        String result = "";

        for(int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i);
        }

        return result;
    }
    }


