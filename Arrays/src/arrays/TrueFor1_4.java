/* if an array have only 1,4 then print true else false
 * {1,1,1}-true
 * {1,4,1,4)-true
 * {1,4,5,1}-false
*/
package arrays;
public class TrueFor1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {1,1,1,4};
		int c=0;
		for(int i=0;i<a.length;i++) {
			 if(a[i]!=1&&a[i]!=4)
				c++;
		}
		if(c>0)
			System.out.println("False");
		else
			System.out.println("True");
	}

}
