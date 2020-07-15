package pbl;
import java.util.*;
public class Remove_star {
public static String star(String s) {
	int l=s.length();
	int c=0;
	for(int i=0;i<l;i++) {
		if(s.charAt(i)=='*')
			c=i;
	}
	return s.substring(0,c-1)+s.substring(c+2,l);
	//return s;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.next();
System.out.println(star(s));
	}

}
