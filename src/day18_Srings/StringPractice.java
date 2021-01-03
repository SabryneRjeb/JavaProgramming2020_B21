package day18_Srings;

public class StringPractice {
    public static void main(String[] args) {
        String s1 ="cat";
        String s2 = "cat";

        System.out.println(s1==s2);

        String s3 = new String ("cat");

        System.out.println(s1==s3); // false
        System.out.println(s2==s3); // false

        String s4 = new String("cat");

        System.out.println(s3==s4); // false

        //equals(
        System.out.println(s1.equals(s3));  // only compares the text not location in the memory
        // true
        System.out.println(s2.equals(s3));  // true
        System.out.println(s3.equals(s4));

        String s5 = new String ("cat");
        System.out.println(s4.equals(s5)); // false equals method is case sensitive
        System.out.println(s4.equalsIgnoreCase(s5));

        System.out.println("==========================================");
        String str = "Cybertek";
                str = str.toUpperCase(); // "Cybertek"
        System.out.println(str);

        System.out.println("=========================================");
        String name = "Sabryne Rjeb";
        int n1 = name.length();// 12 but last index is 11 cuz the index numbers start with 0
        System.out.println(n1);
        int lastIndex = name.length()-1;
        System.out.println(lastIndex);
        System.out.println("==============================================");
        String a = "Cybertek School";
        char firstChar = a.charAt(0);
        char lastChar = a.charAt(a.length()-1);
                        // last index num of a

        System.out.println("First character: "+firstChar);
        System.out.println("Last character: "+ lastChar);

        System.out.println("=================================================");

        String b = "Today is Monday";
    char secondChar = b.charAt(1);
    char secondLastChar = b.charAt(b.length()-2);
        System.out.println("second character is: "+secondChar);
        System.out.println("second last character is: "+secondLastChar);

    }




}
