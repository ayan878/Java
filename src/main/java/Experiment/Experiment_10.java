//10. WAP to create constructor of a class and initialize values in it and later print them.
package Experiment;

public class Experiment_10 {

	    public static void main(String args[])
	    {
	       Initialize i=new Initialize();
	       i.print_val();
	    }
	}
	class Initialize{
	    int a;
	    public Initialize()
	    {
	        a=10;
	    }
	    void print_val()
	    {
	        System.out.println("Initialized value of Variable="+a);
	    }
	}
