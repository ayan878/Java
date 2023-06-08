//12. WAP to implement the concept of method overloading and constructor overloading.
package Experiment;


public class Experiment_12 {
    private int value;

    // Constructor Overloading
    public Experiment_12() {
        value = 0;
    }

    public Experiment_12(int value) {
        this.value = value;
    }

    // Method Overloading
    public void display() {
        System.out.println("Value: " + value);
    }

    public void display(String message) {
        System.out.println(message + ": " + value);
    }

    public void display(int num) {
        System.out.println("Number: " + num);
    }

    public static void main(String[] args) {
        // Constructor Overloading
        Experiment_12 obj1 = new Experiment_12();
        Experiment_12 obj2 = new Experiment_12(10);

        // Method Overloading
        obj1.display();                   // Calls display() without arguments
        obj1.display("Hello");            // Calls display() with a String argument
        obj1.display(5);                  // Calls display() with an int argument

        System.out.println();

        obj2.display();                   // Calls display() without arguments
        obj2.display("Hi");               // Calls display() with a String argument
        obj2.display(7);                  // Calls display() with an int argument
    }
}
