package pbl;
import java.util.*;
public class Remove_x {
public static String remove(String s) {
	int l=s.length();
	if(s.charAt(0)=='x'&&s.charAt(l-1)=='x') 
		return s.substring(1,l-1);
	else if(s.charAt(0)=='x')
		return s.substring(1,l);
	else if(s.charAt(l-1)=='x')
		return s.substring(0,l-1);
	return s;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(remove(s));
	}

}
