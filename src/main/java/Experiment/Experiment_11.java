/*11. WAP to create a class Student with data ‘name, city and age’ along with method printData to
display the data. Create two objects s1, s2 to declare and access the values. */
package Experiment;

public class Experiment_11 {
    private String name;
    private String city;
    private int age;

    public Experiment_11(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating objects and accessing values
        Experiment_11 s1 = new Experiment_11("Ayan Raza", "New York", 20);
        Experiment_11 s2 = new Experiment_11("Belal Ahmed", "London", 22);

        // Calling the printData() method to display the data
        System.out.println("Student 1:");
        s1.printData();

        System.out.println("\nStudent 2:");
        s2.printData();
    }
}
