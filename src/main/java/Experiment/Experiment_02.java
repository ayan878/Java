package Experiment;
import java.util.Scanner;
import static java.lang.System.out;

public class Experiment_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Experiment_02 Ex2 =new Experiment_02();
		Ex2.mathmaticalOperation();
	
	}
	public void mathmaticalOperation(){
		Scanner sc =new Scanner(System.in);
		out.print("Enter the Number_01\n");
		int x = sc.nextInt();
		out.print("Enter the Number_02\n");
		int y = sc.nextInt();
		
		out.println("Addition		:" +x+y);
		out.println("Substraction		:" + (x-y));
		out.println("Multiplication		:" +x*y);
		out.println("Divide			:" +x/y);
		out.println("Modulus			:" +x%y);
	}	
}
