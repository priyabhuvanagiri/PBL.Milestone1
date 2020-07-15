/*Given 2 int arrays, a and b, each length 3, form a new array of length 2, containing their middle elements.
middleWay([1, 2, 3], [4, 5, 6]) - [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) - [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) - [2, 4]
*/

package arrays;
import java.util.Arrays; 
public class MidNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {1,2,3};
		int[] b=new int[] {4,5,6};
		/*for(int i=0;i<3;i++) {
			if(i==1) {
				System.out.print(a[i]+",");
				System.out.print(b[i]);
			}
		}*/
		int[] res=new int[] {a[1],b[1]};
		System.out.println(Arrays.toString(res));
		
	}

}
