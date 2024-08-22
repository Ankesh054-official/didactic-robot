package LABS.lab9.Assignment2;

import java.util.Scanner;

/**
 * Parent class Shape
 */
public class Shape {

    /**
     * Method: {@link #getArea()}
     */
    public int getArea(){
        return 0;
    }
}

/**
 * Child of Shape
 */
class Circle extends Shape{
    int radius;
    final float PI = 3.14F;

    /**
     * @param radius
     */
    public Circle(int radius) {
        this.radius = radius;
    }

    /**
     * Method: {@link #getArea()}
     * @return {@code PI*radius^2}
     */
    @Override
    public int getArea() {
        return (int) (this.PI*this.radius*this.radius);
    }
}

/**
 * Child of Shape
 */
class Square extends Shape{
    int length;

    /**
     * @param length
     */
    public Square(int length) {
        this.length = length;
    }

    /**
     * Method: {@link #getArea()}
     * @return {@code length^2}
     */
    @Override
    public int getArea() {
        return this.length*this.length;
    }
}

/**
 * Child of Shape
 */
class Rectangle extends Shape{
    int width;
    int height;

    /**
     * @param width
     * @param height
     */
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * O
     * Method: {@link #getArea()}
     * @return {@code height*width}
     */
    @Override
    public int getArea() {
        return this.height*this.width;
    }
}

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle(sc.nextInt());
        Square s = new Square(sc.nextInt());
        Rectangle r = new Rectangle(sc.nextInt(), sc.nextInt());

        System.out.println("Circle Area: "+c.getArea());
        System.out.println("Square Area: "+s.getArea());
        System.out.println("Rectangle Area: "+r.getArea());
    }
}