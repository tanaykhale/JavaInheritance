package selectionsort;

public class SelectionSort<T> {
	 private T[] arr;

	    public SelectionSort(T[] arr) {
	        this.arr = arr;
	    }

	    public void sort() {
	        int small;
	        for (int i = 0; i < arr.length - 1; i++) {
	            small = i;
	            for (int j = i + 1; j < arr.length; j++) {
	                if (((Object) arr[j]).compareTo(arr[small]) < 0) {
	                    small = j;
	                }
	            }
	            if (i != small) {
	                T temp = arr[i];
	                arr[i] = arr[small];
	                arr[small] = temp;
	            }
	        }
	    }

	    public void display() {
	        for (T element : arr) {
	            System.out.print(element + " ");
	        }
	        System.out.println();
	    }
}
