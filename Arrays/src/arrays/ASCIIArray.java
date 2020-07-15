/*Initialize an integer array with ascii values 
  and print the corresponding character values in a single row. */


package arrays;
public class ASCIIArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {65,78,97,102,121};
		for(int i=0;i<a.length;i++) {
			System.out.print((char)a[i]+" ");
		}

	}

}
