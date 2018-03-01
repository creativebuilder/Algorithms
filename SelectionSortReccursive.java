import java.util.Arrays;

public class SelectionSortReccursive {
	
	public static int[] swap(int a[],int pos1,int pos2) {
		if(pos1!=pos2) {
			a[pos1]=a[pos1]+a[pos2];
			a[pos2]=a[pos1]-a[pos2];
			a[pos1]=a[pos1]-a[pos2];		
		}
		return a;
	}
	
	public static int[] SelectionSort(int a[],int start,int n) {
		
		if(start>=n-1) {
			return a;
		}
		
		//find the min value in the list	
		int minpos=start;
		for(int i=start+1;i<n;i++) {
			if(a[i]<a[minpos]) {
			     minpos=i;
			}
		}
		
		//swap the min value to its corresponding position in the list
		a=swap(a,start,minpos);
		
		a=SelectionSort(a,start+1,n);
		return a;
	}

	public static void main(String[] args) {
		
		int a[]= {18,23,36,72,14,95};
		a=SelectionSort(a,0,a.length);
		System.out.println(Arrays.toString(a));

	}

}
