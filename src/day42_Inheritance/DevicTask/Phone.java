package day42_Inheritance.DevicTask;

public class Phone extends Device {
    // set attributes by generating the constructor
    public static boolean canCall, canSendMessage, hasCamera;
    static {
        canCall = true;
        canSendMessage= true;
        hasCamera=true;
    }

    public Phone(String brand, String model,double price){
        SetInfo("Phone",brand,model,price);

    }
public void call(long number){
    System.out.println(brand+" "+model+"is calling"+number);
}

public void text(long number){
    System.out.println(brand+" "+model+"is texting"+number);
}

}
