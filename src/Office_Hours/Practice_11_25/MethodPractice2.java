package Office_Hours.Practice_11_25;

public class MethodPractice2 {
    public static void main(String[] args) {
        //100,200
        max(100, 200);
        System.out.println(max(100, 200) * 2);
    }

    public static int max(int a, int b) {  // int instead of void to be able to return data
        int maximum = (a > b) ? a : b;
        // System.out.println(maximum); // we do not need to give print statement inside method in order to avoid multiple results on the console
        return maximum;
    }

    public static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    public static int max(int a, int b, int c, int d) {
        return max(max(a, b, c), d);
    }

    /*
    create methods for min number
    make sure that max method also accepts double
     */







}
