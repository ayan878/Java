//24.WAP to implement concept of multithreading by extending Thread class. 
package Experiment;
public class Experiment_24 {
    public static void main(String args[])
    {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        t1.start();
        t2.start();
    }
}
class Thread1 extends Thread{
public void run()
{
System.out.println("In Thread 1");
 for(int i=0;i<5;i++)
 {
    System.out.print("\t"+i);
 }
}
}
class Thread2 extends Thread{
   
    public void run()
    {
        System.out.println("In Thread 2\n");
        for(int i=0;i<5;i++)
        {
            System.out.print("\t"+i);
        }
    }
}