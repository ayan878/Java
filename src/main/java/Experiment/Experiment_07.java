package Experiment;

import java.util.Scanner;
public class Experiment_07 {
    public static void main(String args[])
    {
       int A[][]=new int[2][2];//first Matrix
       int B[][]=new int[2][2];//Second Matrix
       int D[][]=new int[2][2];//fourth matrix
       int i,j,k;
       int C[][]=new int[2][2];// third matrix 
       Scanner sc=new Scanner(System.in);
    //    Code for Get First Matrix Values
       System.out.println("Enter Value for first Matrix=");
       for(i=0;i<2;i++)
       {
        for(j=0;j<2;j++)
        {
            A[i][j]=sc.nextInt();
        }
       }
       // Code for Get Second Matrix Values
       System.out.println("Enter value for Second Matrix=");
       for(i=0;i<2;i++)
       {
        for(j=0;j<2;j++)
        {
            B[i][j]=sc.nextInt();
        }
       }
       /* Addition of Matrix code */
       for(i=0;i<2;i++)
       {
        for(j=0;j<2;j++)
        {
             D[i][j]=A[i][j]+B[i][j];
        }

       }
       System.out.println("After addition of two Matrixes");
       for(i=0;i<2;i++)
       {
        for(j=0;j<2;j++)
        {
            System.out.print("\t"+D[i][j]);
        }
        System.out.println();
       }
      
    
       /*-------------Code for Multiplication------------------ */
       for(i=0;i<2;i++)
       {
        for(j=0;j<2;j++)
        {
           int sum=0;
            for(k=0;k<2;k++)
            {
                sum=sum+A[i][k]*B[k][j];
            }
            C[i][j]=sum;
        }
       }
       //Display Of Multiplication of two mutrixes
       System.out.println("After Multiplication of Matrixes=");
       for(i=0;i<2;i++)
       {
        for(j=0;j<2;j++)
        {
            System.out.print("\t"+C[i][j]);
        }
        System.out.println("\n");
       }
       
    }
    
}