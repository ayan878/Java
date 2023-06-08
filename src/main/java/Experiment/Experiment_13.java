//13. WAP to create a class Shape and override area () method to calculate area of rectangle, square
//and circle.
package Experiment;

abstract class Shape {
    public abstract double area();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}

class Circle extends Shape {
    private double radius;
    private final double PI = 3.14159;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }
}

public class Experiment_13 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);
        Square square = new Square(5);
        Circle circle = new Circle(3);

        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Square: " + square.area());
        System.out.println("Area of Circle: " + circle.area());
    }
}
