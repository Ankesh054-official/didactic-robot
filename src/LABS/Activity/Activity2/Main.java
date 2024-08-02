package LABS.Activity.Activity2;


/**
 * Assignment -1.
 * ● Write a Java program to create a class called Vehicle with a method called
 * drive().
 * ● Vehicle should have attributes such as make (String), model (String) ,
 * year (int) and maximumSpeed (int).
 * ● Create a constructor in Vehicle with all fields as constructor parameters.
 * ● Create a subclass called Car and override constructor. Call super(). ●
 * Write a function that overrides the drive() method to print (make + “ ” +
 * model + " Car is driving". )
 * ● Also create another subclass Bike extending the vehicle class. ●
 * Override the drive() method to print (make + “ ” + model + " Bike is
 * driving". )
 * ● Instantiate both Bike and Car class. Print their attributes
 */

public class Main {
    public static void main(String[] args) {
        Car BMW = new Car("BMW", "3.0 CSL", 2023, 186);
        Bike DODGE = new Bike("Dodge", "Tomahawk", 2023, 300);

        BMW.drive();
        System.out.println("\n");
        DODGE.drive();
    }
}

class Vehicle {

    String make;
    String model;
    int year;
    int maximumSpeed;

    public Vehicle(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    void drive(){
        System.out.println("Driving");
    }
}

class Car extends Vehicle{
    public Car (String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    @Override
    void drive() {
        System.out.println(this.make + " " + this.model + "\nMaxSpeed:\t"+ this.maximumSpeed + "\nCar is driving.");
    }
}

class Bike extends Vehicle{

    public Bike(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    @Override
    void drive(){
        System.out.println(this.make + " " + this.model + "\nMaxSpeed\t"+ this.maximumSpeed + "\nBike is driving.");
    }
}