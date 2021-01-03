package day42_Inheritance.AnimalTask;

public class Zoo { // zoo has tiger is the relationship here

    public static void main(String[] args) {
        Tiger tiger = new Tiger("Tiger","black","Simba","Large",'M',3);

        System.out.println(tiger);
        tiger.eat("Chicken");
        //tiger.meow();
        //tiger.bark();

        tiger.Hunt();
        tiger.Roar();
        Cat cat = new Cat("Turkish","yellow","Dax","Small",'F',7);

        System.out.println(cat);
        cat.eat("Tuna");
        cat.drink("milk");
        cat.sleep();
        cat.meow();



        Dog dog = new Dog("Bullet","Lab",'M',3,"Yellow","Huge");
        System.out.println(dog);
        dog.eat("Salmon");
        dog.drink("Beer");
        dog.sleep();
        dog.bark();

    }
}
