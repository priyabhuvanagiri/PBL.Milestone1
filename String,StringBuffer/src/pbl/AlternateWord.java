package pbl;
import java.util.*;
public class AlternateWord {
public static String alternative(String s1,String s2) {
	int l;
	if(s1.length()<=s2.length())
		l=s1.length();
	else
		l=s2.length();
	for(int i=0;i<l;i++) {
		System.out.print(s1.charAt(i)+""+s2.charAt(i));
	}
	return "";
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	String s1=sc.next();
	String s2=sc.next();
	System.out.println(alternative(s1,s2));
	}

}
