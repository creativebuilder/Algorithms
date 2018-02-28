import java.util.Arrays;

public class InsertionSortRecursive {
	
	public static int[] swap(int a[],int pos1,int pos2) {
		int tmp;
		tmp=a[pos1];
		a[pos1]=a[pos2];
		a[pos2]=tmp;
		return a;
	}
	
	public static int[] Insert(int a[],int start) {
		int nextpos=start;
		while(nextpos>0 && a[nextpos]<a[nextpos-1]) {
			a=swap(a,nextpos,nextpos-1);
			nextpos=nextpos-1;
		}
		return a;
	}
	
	public static int[] InsertionSort(int a[],int start,int n) {
		if(start>=n-1) {
			return a;
		}
		//To insert the current value into the sorted sequence
		a=Insert(a,start);
		
		/*We are assuming that the sequence a[0] to [i-1] is Sorted and we are recursively calling sort from
		 a[i] to a[n-1]*/
		
		a=InsertionSort(a,start+1,n);
		return a;
	}

	public static void main(String[] args) {
		
		int a[]= {18,23,36,72,14,95};
		a=InsertionSort(a,0,a.length);
		System.out.println("Sorted Array"+Arrays.toString(a));
		
	}
	
	

}
