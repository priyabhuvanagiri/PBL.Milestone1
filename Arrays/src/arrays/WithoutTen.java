/*Print a version of the given array where all the 10's have been removed. 
 * The remaining elements should shift left towards the start of the array 
 * as needed, and the empty spaces at the end of the array should be 0.
 *  So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and display the 
 *  given array or make a new array.
withoutTen([1, 10, 10, 2]) - [1, 2, 0, 0]
withoutTen([10, 2, 10]) - [2, 0, 0]
withoutTen([1, 99, 10]) - [1, 99, 0]
*/

package arrays;
public class WithoutTen {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a=new int[] {8,10,10,2,3};
		int c=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=10)
			{
				a[c]=a[i];
				c++;
			}
		}
		while(c<a.length) {
			a[c]=0;
			c++;
		}
			for(int j=0;j<a.length;j++)
			{
			System.out.print(a[j]+" ");
			}
	
	}
}

/*
 * int[] a=new int[]{1,10,10,2};
int i,x=1;
	for( i=0;i<a.length;i++) {
		if(a[i]==10)
		{
			a[i]=0;
		}
	}
	for(int j=0;j<a.length;j++)
	{
		int temp=0;
		if(a[j]==0)
		{
		temp=a[j];
		a[j]=a[a.length-x];
		a[a.length-x]=temp;
		j++;
			
		}
		
	}
	for(i=0;i<a.length;i++)
	{
	System.out.println(a[i]);
	}
}
}
*/
