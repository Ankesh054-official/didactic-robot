package LABS.Practice.TypeCasting.NonPrimitive;

class Animal{
    void sound(){
        System.out.println("sound");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("bark");
    }

    void fetch(){
        System.out.println("Fetching");
    }
}

public class Widning {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Dog dog = (Dog)animal;
        dog.sound();
        dog.fetch();
    }
}
