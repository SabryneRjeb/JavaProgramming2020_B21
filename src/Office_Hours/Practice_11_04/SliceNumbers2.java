package Office_Hours.Practice_11_04;

public class SliceNumbers2 {
    public static void main(String[] args) {
        int number = 12345;
        String str =""+number; //"12345"

        for(int i =0,j=1; i<str.length();i++,j++) {
        /*System.out.println("digit1:"+str.charAt(0));
        System.out.println("digit2:"+str.charAt(1));
        System.out.println("digit3:"+str.charAt(2));
        System.out.println("digit4:"+str.charAt(3));
        System.out.println("digit5:"+str.charAt(4));
        */

            System.out.println("digit" + j + ": " + str.charAt(i));
        }
    }



}
