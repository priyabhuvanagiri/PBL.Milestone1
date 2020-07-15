/*Write a program to initialize an array and print them in a sorted order. */

package arrays;
import java.util.Arrays; 
public class ArraySorting {

	 public static void main(String[] args) 
	    { 
	        int[] arr = {13, 7, 6, 45, 21, 9, 101, 102}; 
	        Arrays.sort(arr); 
	        System.out.printf("Sorted array : %s",Arrays.toString(arr)); 
	    } 
}
