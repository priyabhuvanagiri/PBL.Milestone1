/* Write a program to find the biggest number in a 3*3 array. The program is supposed to receive 9 integer numbers as command line arguments.
Example1:
C:\>java Sample 1 2 3
O/P: Please enter 9 integer numbers
Example2:
C:\>java Sample 1 23 45 55 121 222 56 77 89
O/P: 
The given array is :
1 23 45 
55 121 222 
56 77 89 
The biggest number in the given array is 222
*/

package arrays;

public class Matrix3x3 {
	public static void main(String[] args) {
		int i,j;
		int[] arr=new int[9];
		int l=arr.length;
		int x[][]=new int[3][3];
		
		if(l<9)
		{
			System.out.println("enter 4 values");
			
		}
		else
		{
			int k=0;
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					x[i][j]=Integer.parseInt(args[k]);
					k++;
					//System.out.println("x[][]"+x[]);
				}
			}
		}
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					System.out.print(x[i][j]+" ");
				}
				System.out.println();
			}
			int max=1;
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					if(max<x[i][j])
						max=x[i][j];
				}
				
			}
			System.out.println("max. element in matrix:"+max);
		}
}

