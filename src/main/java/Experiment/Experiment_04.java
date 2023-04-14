package Experiment;

import java.util.Scanner;

public class Experiment_04 {

	static boolean isPrime(int n, int i) {
		//let x =3 parameter passed
		if (n<=2)
		return (n==2)?true:false;
		
		if (n%i==0)
		return false;
		
		if(i*i>n)
		return true;
		
		return isPrime(n,i+1);
		
	}
//using itertion
	public void isPrime(int num) {
		for ( int i=2;i<=num;i++) {
			if (num<=2)
			System.out.println("Prime Number");
				
			if (num%i==0)
				System.out.println("Non Prime Number");	
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		int x = sc.nextInt();
		
		if (isPrime(x,2))
		System.out.println("Prime Number"); 
		else
		System.out.println("Non Prime Number");
		
		//for iteration
		Experiment_04 exp =new Experiment_04();
		exp.isPrime(x);

}
}
