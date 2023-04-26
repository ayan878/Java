package Experiment;

class Student {

	  //  private variables
	  private String name;
	  private String rollno;

	  // setter method to set the name
	  public void setName(String n) {
	    this.name = n;
	  }

	  // getter method to retrieve the name
	  public String getName() {
	    return name;
	  }

	  // setter method to set the roll number
	  public void setRollno(String r) {
	    this.rollno = r;
	  }

	  // getter method to retrieve the roll number
	  public String getRollno() {
	    return rollno;
	  }
	}

	public class Experiment_09 {

	  public static void main(String[] args) {
	    // object of the class is created
	    Student s1 = new Student();

	    s1.setName("Ayan Raza");
	    s1.setRollno("22SCSE2140045");

	    // printing the value returned by getName()
	    System.out.println(s1.getName());

	    // printing the value returned by getRollno()
	    System.out.println(s1.getRollno());
	  }
	}
