import java.util.Arrays;

public class MergesortMain {
	public static void Divide(int arr[],int start,int end) {
		if(start>=end)
			return;
		int mid=(start+end)/2;
		Divide(arr, start, mid);
		Divide(arr, mid+1, end);
		
		merged(arr, start, mid, end);
	}
	public static void merged(int arr[],int start,int mid,int end) {
		int merge[]=new int[end-start+1];
		int idx1=start;
		int idx2=mid+1;
		int x=0;
		while(idx1<=mid && idx2<=end) {
			if(arr[idx1]<=arr[idx2])
				merge[x++]=arr[idx1++];
			else
				merge[x++]=arr[idx2++];
		}
		while(idx1<=mid) {
			merge[x++]=arr[idx1++];
		}
		while(idx2<=end)
			merge[x++]=arr[idx2++];
		
		for (int i = 0; i < merge.length; i++) {
            arr[start + i] = merge[i];
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,9,-1,3,22};
		Divide(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
