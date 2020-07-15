package pbl;
import java.util.*;
public class halfword {
	public static String firsthalf(String s) {
		int n=s.length();
		String c=s.substring(0,n/2);
		return c;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(s.length()%2==0) 
			System.out.println(firsthalf(s));
		else
			System.out.println("null");
		
	}
}
