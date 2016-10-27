package insertionSort;

public class InsertionSort {

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
