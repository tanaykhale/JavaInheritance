package Quictsort;

import java.util.Arrays;

public class Quicksortoperations {
	public static int partition(int []arr,int low,int high) {
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot)
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		i++;
		int temp=arr[i];
		arr[i]=pivot;
		arr[high]=temp;
		return i;
	}
	public static void quickSort(int arr[],int low,int high) {
		if(low<high) {
			int p=partition(arr,low,high);
			quickSort(arr, low, p-1);
			quickSort(arr, p+1, high);
		}
	}
	public static void main(String args[]) {
		int arr[]= {17,21,-1,82,36,40,7,15};
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
