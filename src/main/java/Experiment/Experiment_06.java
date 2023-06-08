
/*6. WAP to sort n numbers using bubble sort, selection sort, and insertion sort.*/
package Experiment;


	import java.io.*;
	public class Experiment_06
	{
	int a[];
	int n;
	static BufferedReader br = new BufferedReader(new
	InputStreamReader(System.in));
	public Experiment_06(int nn) // Constructor
	{
	a = new int[nn];
	n = nn;
	}
	public static void main(String args[]) throws IOException
	{
	System.out.print("\nEnter the size of the array : ");
	int nn = Integer.parseInt(br.readLine());
	Experiment_06 call = new Experiment_06(nn);
	// Read array from user
	System.out.println("\nEnter " +nn +" elements :");
	call.readArray();
	// Ask for choosing the sorting technique
	System.out.println("Choose Sorting Technique :\n");
	System.out.println("1 : Bubble Sort");
	System.out.println("2 : Selection Sort");
	System.out.println("3 : Insertion Sort");
	System.out.println("4 : Quick Sort");
	System.out.print("\nYour Choice : ");
	int choice = Integer.parseInt(br.readLine());
	switch(choice)
	{
	case 1:
	call.bubbleSort();
	break;
	case 2:
	call.selectionSort();
	break;
	case 3:
	call.insertionSort();
	break;
	case 4:
	call.quickSort();
	break;
	default :
	System.out.println("\nInvalid Choice !");
	System.exit(1);
	break;
	}
	call.display(); // Print the sorted array
	}
	public void readArray() throws IOException
	{
	for(int i=0;i<n;i++)
	a[i] = Integer.parseInt(br.readLine());
	}
	public void bubbleSort()
	{
	int t;
	for(int i=0;i<n-1;i++)
	{
	for(int j=0;j<n-1-i;j++)
	{
	if(a[j]>a[j+1])
	{
	t = a[j];
	a[j] = a[j+1];
	a[j+1] = t;
	}
	}
	}
	}
	public void selectionSort()
	{
	int t, min;
	for(int i=0;i<n-1;i++)
	{
	min = i;
	for(int j=i+1;j<n;j++)
	{
	if(a[min]>a[j])
	min = j;
	}
	if(min!=i)
	{
	t = a[min];
	a[min] = a[i];
	a[i] = t;
	}
	}
	}
	public void insertionSort()
	{
	int t,j;
	for(int i=1;i<n;i++)
	{
	j = i-1;
	t = a[i];
	while(t<a[j] && j>=0)
	{
	a[j+1] = a[j];
	j--;
	}
	a[j+1] = t;
	}
	}
	public void quickSort()
	{
	int t;
	for(int i=0;i<n-1;i++)
	{
	for(int j=i+1;j<n;j++)
	{
	if(a[i]>a[j])
	{
	t = a[i];
	a[i] = a[j];
	a[j] = t;
	}
	}
	}
	}
	public void display()
	{
	System.out.println("\nSorted Array :");
	for(int i=0;i<n;i++)
	System.out.println(a[i]);
	}
	}
