package Experiment;

import java.util.Scanner;

//WAP to find maximum in array
class Experiment_08
 { 
//	int[] arr=null;
	Scanner sc = new Scanner(System.in);
	
	public void insertionArray() {
	
	}
	public void getMax() {
	
		System.out.println("Enter the Size of Array:\n");
		int n = sc.nextInt();
		int[] arr= new int[n];
//		insertion of arrays
		for(int i=0; i< arr.length; i++) {
			System.out.println("Enter the value of array");
			arr[i]=sc.nextInt();
		}
//		get max number from array
    	int max =arr[0];
    	for(int i=1; i<arr.length; i++) {
    		if(max<arr[i]) {
    			max=arr[i];
    		}
    	}
    	System.out.println(max);
	}
	    public static void main(String ar[])
	    {
	    	Experiment_08 exp = new Experiment_08();
	    	exp.getMax();
	    }
	    
	}

