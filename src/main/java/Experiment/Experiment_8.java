package Experiment;

public class Experiment_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp=0;
		int arr[]= {1,2,7,5,3,9};
		int n = 0;
		Experiment_8 exp=new Experiment_8();
		Experiment_8.getLargest(arr,n);
		System.out.println(getLargest(arr,n));

	}
public static void getLargest(int arr[],int n) {
	int temp=0;
for(int i=0;i<n; i++) {
	for(int j=i+1;i<n;i++) {
		if(arr[i]>arr[j]) {
			temp=arr[j];
			arr[j]=temp;
			temp=arr[i];
		}
	}
}
}

}
