package LABS.lab10.Assignment2;

public class Animal {
    public void makeSound(){
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal{

    @Override
    public void makeSound() {
        System.out.println("The Cat meows");
    }
}

class Main{
    public static void main(String[] args) {
        Dog leo = new Dog();
        Cat lily = new Cat();

        leo.makeSound();
        lily.makeSound();
    }
}