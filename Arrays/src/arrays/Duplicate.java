/*Write a program to remove the duplicate elements in an array and
 print
Eg) Array Elements--12,34,12,45,67,89
O/P: 12,34,45,67,89
*/

package arrays;
public class Duplicate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12,34,12,45,32,45};
		int len=a.length;
		System.out.print("Array with duplicate elements: ");
		for(int i=0;i<=len-1;i++)
		{
			System.out.print(a[i]+" ");
		}

		for(int i=0;i<=len-1;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=a[len-1];
					len--;
					j--;//optional
				}
			}
		}
		System.out.println();
		System.out.print("Array without duplicate elements: ");
		for(int i=0;i<=len-1;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
