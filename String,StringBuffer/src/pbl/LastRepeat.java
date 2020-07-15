package pbl;
import java.util.*;
public class LastRepeat {
	public static String last(String s,int n) {
		int l=s.length();
		for(int i=1;i<=n;i++) {
			System.out.print(s.substring(l-n,l));
		}
		return "";
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	int n=sc.nextInt();
	System.out.println(last(s,n));
}
}
