/*print even num first and the odd num in a given array
 * {2,3,5,6,8,9}---->{2,4,6,8,3,5,9}
 * {2,3,2,3,2}----->{2,2,2,3,3}
 */
package arrays;
public class Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {4,5,5,4,5};
		int l=a.length;
		for(int i=0;i<l;i++) {
			if(a[i]%2==0) {
				System.out.print(a[i]+" ");
			}
		}
			for(int j=0;j<l;j++) {
				if(a[j]%2!=0) {
					System.out.print(a[j]+" ");
				}
		}
		
		
	}

}
