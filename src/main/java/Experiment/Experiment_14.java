//14. WAP to demonstrate simple inheritance and multilevel inheritance

package Experiment;

//Parent class
class Vehicle {
 protected String brand;

 public Vehicle(String brand) {
     this.brand = brand;
 }

 public void displayBrand() {
     System.out.println("Brand: " + brand);
 }
}

//Child class inheriting from Vehicle
class Car extends Vehicle {
 private String model;

 public Car(String brand, String model) {
     super(brand);
     this.model = model;
 }

 public void displayModel() {
     System.out.println("Model: " + model);
 }
}

//Grandchild class inheriting from Car
class SportsCar extends Car {
 private int topSpeed;

 public SportsCar(String brand, String model, int topSpeed) {
     super(brand, model);
     this.topSpeed = topSpeed;
 }

 public void displayTopSpeed() {
     System.out.println("Top Speed: " + topSpeed + " mph");
 }
}

public class Experiment_14 {
 public static void main(String[] args) {
     // Simple Inheritance
     Car car = new Car("Ford", "Mustang");
     car.displayBrand();
     car.displayModel();
     System.out.println();

     // Multilevel Inheritance
     SportsCar sportsCar = new SportsCar("Ferrari", "458 Italia", 200);
     sportsCar.displayBrand();
     sportsCar.displayModel();
     sportsCar.displayTopSpeed();
 }
}

