/* Write a program to reverse the elements of a given 2*2 array. 
Four integer numbers needs to be passed as Command Line arguments.
Example1)
C:\>java Sample 1 2 3
O/P: Please enter 4 integer numbers
Example2)
C:\>java Sample 1 2 3 4
O/P: 
 The given array is :
  1 2 
  3 4 
 The reverse of the array is :
  4 3 
  2 1
*/

package arrays;
public class ReverseMatrix {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array=new int[] {1,2,3,8};
		if(array.length<4)
			System.out.println("enter 4 elements");
		else {
		System.out.println("Given matrix:");
		for(int i=0;i<2;i++) {
			System.out.print(array[i]+" ");
			}
			System.out.println();
			for(int j=2;j<4;j++) {
				System.out.print(array[j]+" ");
			}
			System.out.println("\nReversed matrix:");
			for(int i=3;i>=2;i--) {
				System.out.print(array[i]+" ");
				}
				System.out.println();
				for(int j=1;j>=0;j--) {
					System.out.print(array[j]+" ");
				}
		}
	}

}
