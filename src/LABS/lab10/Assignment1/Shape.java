package LABS.lab10.Assignment1;

public abstract class Shape {
    public abstract double calculateArea();
}


class Circle extends Shape{

    double radius;
    final float PI = 3.14F;

    /**
     * @param radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return (this.PI * this.radius * this.radius);
    }
}

class Rectangle extends Shape{
    double length;
    double width;

    /**
     *
     * @param length
     * @param width
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    @Override
    public double calculateArea() {
        return (this.length*this.width);
    }
}

class Main{
    public static void main(String[] args) {
        Circle cr = new Circle(5);
        Rectangle r = new Rectangle(4,2);
        System.out.println(cr.calculateArea());
        System.out.println(r.calculateArea());
    }
}