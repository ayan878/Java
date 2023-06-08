/*15. Write a java program to create an abstract class named Shape that contains two integers and an
empty method named print Area (). Provide three classes named Rectangle, Triangle and Circle
such that each one of the classes extends the class Shape. Each one of the classes contains only
the method print Area () that prints the area of the given shape.*/

package Experiment;

abstract class Shape {
    protected int length;
    protected int width;

    public Shape(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public abstract void printArea();
}

class Rectangle extends Shape {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public void printArea() {
        int area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {
    public Triangle(int length, int width) {
        super(length, width);
    }

    @Override
    public void printArea() {
        int area = (length * width) / 2;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super(0, 0);
        this.radius = radius;
    }

    @Override
    public void printArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);
        Triangle triangle = new Triangle(6, 3);
        Circle circle = new Circle(3);

        rectangle.printArea();
        triangle.printArea();
        circle.printArea();
    }
}
