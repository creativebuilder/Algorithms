import java.util.Arrays;

public class InsertionSort {
	
	public static int[] swap(int arr[],int pos1,int pos2) {
		int tmp;
		tmp=arr[pos1];
		arr[pos1]=arr[pos2];
		arr[pos2]=tmp;
		
		return arr;
	}
	
	public static void main(String args[]) {
		
		int a[]= {18,23,36,72,14,95};
		int min,nextpos;
		
		
		for(int i=1;i<a.length;i++) {
			
			nextpos=i;
			
			//swapping two values until they get inserted into the correct sorted position
			while(nextpos>0 && a[nextpos]<a[nextpos-1]) {
				swap(a,nextpos,nextpos-1);
				nextpos=nextpos-1;
				System.out.println(i+" loop "+ Arrays.toString(a));
			}
			
			
			System.out.println(i+" loop "+ Arrays.toString(a));
			
		}
		
	}

}
