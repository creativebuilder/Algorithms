import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String args[]) {
		
		int a[]= {18,23,36,72,14,95};
		
		int min,j,i,tmp,swapindex=-1,flag=0;
		
		for(j=0;j<a.length;j++) {
		
			flag=0;
		// to find the minimum among the list
		min=a[j];		
		for(i=j+1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
				swapindex=i;
				flag=1;//set so that there is minimum value and hence swapping should be done
			}
		}
		
		//System.out.println("Swap Index "+swapindex+"Min" +min);
		
		//swap the minimum value
		if(flag==1) {
			tmp=a[j];
			a[j]=min;
			a[swapindex]=tmp;
		}
		
		
		
		
		
		
		
		}
		
		System.out.println("Sorted Array "+Arrays.toString(a));
	}
	
	

}
