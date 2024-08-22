package LABS.lab9.Assignment1;

public class Vehicle {
    String make;
    String model;
    int year;
    int maximumSpeed;

    /**
     * @param make
     * @param model
     * @param year
     * @param maximumSpeed
     */
    public Vehicle(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    public void drive(){
        System.out.println("Vehicle drive");
    }

    public void details(){
        System.out.println("Manufacturer: "+this.make+"\n Model: "+this.model+"\n Year: "+this.year+"\n maxSpeed: "+this.maximumSpeed);
    }
}

/**
 * class Car child of Vehicle class
 */
class Car extends Vehicle{

    /**
     * @param make
     * @param model
     * @param year
     * @param maximumSpeed
     */
    public Car(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    public void drive(){
        System.out.println(this.make + " " + this.model + " Car is driving");
    }
}

/**
 * Bike class child of Vehicle class
 */
class Bike extends Vehicle{

    /**
     * @param make
     * @param model
     * @param year
     * @param maximumSpeed
     */
    public Bike(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    public void drive(){
        System.out.println(this.make + " " + this.model + " Bike is driving");
    }
}

class Main{
    public static void main(String[] args) {
        Car cr = new Car("Task1","2",2024,500);
        Bike bk = new Bike("Task2","54",2024,800);

        cr.details();
        cr.drive();
        System.out.println();
        bk.details();
        bk.drive();
    }
}