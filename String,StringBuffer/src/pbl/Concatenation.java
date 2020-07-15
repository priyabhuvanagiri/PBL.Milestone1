package pbl;
import java.util.Scanner;
public class Concatenation {
public static String getappended(String s1,String s2) {
	int n=s1.length();
	String s;
	if(s1.charAt(n-1)==(s2.charAt(0)))
		s=s1.substring(0,n-1)+s2;
	else
		s=s1+s2;
	return s.toLowerCase();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
        System.out.println(getappended(s1,s2)); 
	}

}
