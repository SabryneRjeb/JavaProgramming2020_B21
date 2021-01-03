package Self_Practice.ReplitTasks;

public class Method_163 {
    public static void main(String[] args) {

        String [] str1 = {"a","foo","bar","foo","bla"};
        String str2 = "foo";
        int count = countAppearance (str1,str2);
        System.out.println(count);
        }
    public static int countAppearance(String[]str1, String str2){

    int count = 0;
    for(String each:str1 ) {

        if (each.equalsIgnoreCase(str2)) {
            count++;
        }

    }
       // System.out.println(count);
           return count;
    }
}