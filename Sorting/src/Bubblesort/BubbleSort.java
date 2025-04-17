package Bubblesort;

public class BubbleSort {
	static void display(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int [] arr= {25,-1,8,3,12};
		int n=arr.length;
		System.out.println("Number of passes required:"+(n-1));
		int count=0;
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					 temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					count++;
				}
			}
			System.out.println("Array after pas"+(i));
			display(arr);
		}
	}

}
