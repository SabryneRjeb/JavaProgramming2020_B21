package Self_Practice;

public class MethodsPractice {
    public static void main(String[] args) {
        divisibleBy2Between1And100();
        divisibleBy2(32,32);

    }


    public static void divisibleBy2Between1And100(){
        for (int i = 1; i<=100;i++){
            if (i%2 !=0){
                continue;
            }
            System.out.print(i+", ");
        }
        System.out.println();

    }

  public static void divisibleBy2(int start, int end){
        if (end<=start){
            System.out.println("Invalid numbers");
            return;
        }
    for (int i = start; i<=end;i++){
        if(i%2 !=0){
            continue;
        }
        System.out.print(i+",");

}



  }





}
