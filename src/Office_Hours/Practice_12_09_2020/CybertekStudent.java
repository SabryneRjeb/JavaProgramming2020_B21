package Office_Hours.Practice_12_09_2020;

public class CybertekStudent {
    public String name;
    public int age ;
    public char gender;

    public static String schoolName = "Cybertek School";
    public static String dreamJob = "SDET";
    public static boolean hasReplit = true;
    public static boolean hasFlipGrid = true;


    public void setInfo(String name, int age, char gender){
        this.name= name;// we use this keyword because name is instance and shared with local variable
        this.age= age;
        this.gender= gender;
    }
    // all static methods and variables are accepted everywhere
    // Instance methods are not ?

    public String toString(){
        return "Name:"+name+", Age:"+age+", Gender: "+gender+", School Name:"+schoolName+", dream job:"+dreamJob
                +", Has Replit:"+hasReplit+", Has FlipGrid:"+hasFlipGrid;
    }

// we have to create objects to be able to use this class

}
