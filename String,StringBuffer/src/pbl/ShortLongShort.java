package pbl;
import java.util.Scanner;
public class ShortLongShort {
public static String sls(String s1,String s2) {
	if(s1.length()>s2.length()) {
		//String s=s2.concat(s1).concat(s2);
		return s2+s1+s2;
	}
	else
	//return s1.concat(s2).concat(s1);
		return s1+s2+s1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	String s1=sc.next();
	String s2=sc.next();
	System.out.println(sls(s1,s2));
	}

}
