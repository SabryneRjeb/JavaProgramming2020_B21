package day42_Inheritance.AnimalTask;

public class Tiger extends Animal{

    public Tiger(String breed, String color, String name, String size, char gender, int age) {
        setInfo(breed, color, name, size, gender, age);
    }

    public void Roar(){
        System.out.println(name+"Roar");
    }

    public void Hunt(){
        System.out.println(name+"is hunting");
    }
}
