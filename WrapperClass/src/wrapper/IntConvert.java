package wrapper;
import java.util.*;
public class IntConvert {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	Integer a=sc.nextInt();
	System.out.println("Given number:"+a);
	String b=Integer.toBinaryString(a);
	System.out.println("Binary equivalent:"+b);
	String h=Integer.toHexString(a);
	System.out.println("Hexadecimal equivalent:"+h);
	String o=Integer.toOctalString(a);
	System.out.println("Octal equivalent:"+o);
}
}
