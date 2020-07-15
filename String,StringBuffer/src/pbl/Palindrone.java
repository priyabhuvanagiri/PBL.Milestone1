package pbl;
//import java.io.*; 
import java.lang.StringBuffer;
public class Palindrone {
	static boolean Checkpalindrone(String s)
	{
		StringBuffer sb=new StringBuffer(s);
		StringBuffer sbrev=sb.reverse();
		String s1=sbrev.toString();
		System.out.println(s1);
		if(s.contentEquals(s1))
			return true;
		else
		return false;
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String s="madam";
			if(Checkpalindrone(s)==true)
			{
				System.out.println("Palindrome");
			}
			else
				System.out.println("not Palindrome");

		}
}
