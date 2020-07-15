/*Write a program to initialize an integer array with values and
  check if a given number is present in the array or not. 
  If the number is not found, it will print -1 else it will 
  print the index value of the given  number in the array
Ex1) Array elements are  {1,4,34,56,7} and the search element is 90
O/P: -1
Ex2)Array elements are  {1,4,34,56,7} and the search element is 56
O/P: 4 
*/

package arrays;
public class ArraySearch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num=Integer.parseInt(args[0]);
		//int[] arr=new int[num] ;
		int[] arr=new int[] {1,2,3,4,5};
		int c=0;
		//int search=Integer.parseInt(args[1]);
		int search=4;
		for(int i=0;i<arr.length;i++) {
			if(search==arr[i]) {
				System.out.println(i);
				c++;
			}
				
		}
		if(c==0)
			System.out.println("-1");
	}
}
