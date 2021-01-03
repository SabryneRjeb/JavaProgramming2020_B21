package day41_Encapsulation;

public class Data {
    public static String publicVariable = "A";
    private static String privateVariable = "B";
    // only reachable within this class
    static String defaultVariable = "C";  // default access modifier
    // default only reachable within the same package
    // protected static String protectedVariable = "D";


}
