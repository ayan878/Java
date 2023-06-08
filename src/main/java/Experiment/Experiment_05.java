/*WAP that uses length property for displaying any number of command line arguments.*/
package Experiment;

public class Experiment_05 {

		  public static void main(String[] args) {

		    for(String str: args) {
		      // convert into integer type
		    int argument = Integer.parseInt(str);
		    System.out.println("Argument in integer form: " + argument);
		    }

		  }
		}
