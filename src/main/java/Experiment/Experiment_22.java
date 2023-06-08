
//22. WAP to enable user to handle any chance of divide by zero exception.
package Experiment;

import java.util.Scanner;

public class Experiment_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("Enter the denominator: ");
        int denominator = scanner.nextInt();

        try {
            int result = divide(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        scanner.close();
    }

    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}
