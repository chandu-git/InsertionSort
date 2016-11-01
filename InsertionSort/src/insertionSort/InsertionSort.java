package insertionSort;

public class InsertionSort {
	/**
	 * Runs through each element of a list, consuming one element upon each repetition, 
	 * and growing a sorted sublist. 
	 * Upon each iteration, insertion sort removes one element from the input data, 
	 * finds the location it belongs within the sorted list, and inserts it there
	 */
	public static int[] insertionSort(int[] a){
		for(int j=1;j<a.length;j++){
			int key = a[j];
			int i=j-1;
			while(i>=0 && a[i]>key){
				a[i+1]=a[i];
				i=i-1;
			}
			a[i+1] = key;
		}
		return a;
	}
	
	public static int[] insertionSortDecreasing(int[] a){
		for(int j=1;j<a.length;j++){
			int key = a[j];
			int i=j-1;
			while(i>=0 && a[i]<key){
				a[i+1]=a[i];
				i=i-1;
			}
			a[i+1] = key;
		}
		return a;
	}
	
	public static void main(String[] args) {
		
	}
}
