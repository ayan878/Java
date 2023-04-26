
/*	WAP to find the factorial of a number using recursion
 *  by taking input through keyboard using Scanner class.*/

package Experiment;
import java.util.Scanner;

public class Experiment_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number:");
		int x = sc.nextInt();
		Experiment_03 exp = new Experiment_03();
		var result =exp.fact(x);
		System.out.println(result);
	}
	public int fact(int n) {
		if (n==0 || n==1) {
			return 1;
		}
		if (n<0) {
			System.out.println("Factorial:" +n);
		}
		return n*fact(n-1);
	}
}
