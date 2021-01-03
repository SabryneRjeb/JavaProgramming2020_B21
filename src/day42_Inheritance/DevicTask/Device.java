package day42_Inheritance.DevicTask;

public class Device {
    public String  deviceName,brand, model;
    public double price;

    public static String madeIn;
    public static boolean hasBattery, hasPowerButton;

    static {
        madeIn = "China";
        hasBattery = true;
        hasPowerButton = true;
    }

    public void SetInfo(String deviceName,String brand,String model,double price){
        this.brand=brand;
        this.model=model;
        this.price = price;
        this.deviceName = deviceName;
    }


    public String toString() {
        return "Device{" +
                "deviceName = '" + deviceName + '\'' +
                ", brand ='" + brand + '\'' +
                ", model ='" + model + '\'' +
                ", price = $" + price +
                '}';
    }

    public void turnOn(){
        System.out.println("turning on"+brand+" "+model);
    }

    public void turnOff(){
        System.out.println("Turning off"+brand+" "+model);
    }

}
