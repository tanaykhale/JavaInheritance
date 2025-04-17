package isertionSort;

import java.util.Arrays;

public class insertionSortmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,5,72,-1,36};
		for(int i=1;i<arr.length;i++) {
			int small=arr[i];
			int j=i-1;
			while(j>=0 && small<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=small;
			System.out.println("Array after Pass "+i);
			System.out.println(Arrays.toString(arr));
		}	
		System.out.println(Arrays.toString(arr));

	}

}
