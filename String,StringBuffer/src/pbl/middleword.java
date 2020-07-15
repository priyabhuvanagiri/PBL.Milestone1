package pbl;
import java.util.*;
public class middleword {
	public static String middle(String s) {
		// System.out.println(s.substring(1,s.length()-1));
	        return s.substring(1,s.length()-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(middle(s));
	}

}
