
/* WAP to print the sum (addition), multiply, 
 * subtract, divide and remainder of two numbers*/

package Experiment;
import java.util.Scanner;

public class Experiment_02 {

	public void mathmaticalOperation(){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number_01\n");
		int x = sc.nextInt();
		System.out.print("Enter the Number_02\n");
		int y = sc.nextInt();

		System.out.println("Addition		:" +x+y);
		System.out.println("Substraction		:" + (x-y));
		System.out.println("Multiplication		:" +x*y);
		System.out.println("Divide			:" +x/y);
		System.out.println("Modulus			:" +x%y);
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Experiment_02 Ex2 =new Experiment_02();
		Ex2.mathmaticalOperation();
	}
}
