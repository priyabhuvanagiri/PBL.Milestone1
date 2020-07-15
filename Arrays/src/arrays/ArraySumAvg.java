/*Write a program to initialize an integer array 
  and print the sum and average of the array */

package arrays;
public class ArraySumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {4,6,33,25,9,5};
		int sum=0;
		float avg;
		//sum & avg of an array
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		avg=(float)sum/a.length;
		System.out.println("sum="+sum);
		System.out.println("average="+avg);
	}

}
