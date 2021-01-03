package day42_Inheritance.DevicTask;

public class DeviceObject {
    public static void main(String[] args) {
        TV tv = new TV("Samsung", "LX32",499.99);
        System.out.println(tv);
        tv.channelUp();
        tv.channelDown();
        tv.turnOff();
        tv.turnOn();

        Phone phone = new Phone("Iphone","12 Pro Max",1200);
        phone.turnOff();
        phone.turnOn();
        phone.call(911);
        phone.text(2023222377);

        System.out.println(TV.hasBattery);





    }
}
