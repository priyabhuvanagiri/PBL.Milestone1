/*Write a program to initialize an integer array and find 
the maximum and minimum value of an array */
package arrays;

public class ArrayMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {4,6,33,25,9,5};
		int max=0,min=9;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("maximum:"+max);
		System.out.println("minimum:"+min);
	}
}
