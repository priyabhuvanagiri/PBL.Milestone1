package wrapper;
import java.util.*;
public class Binary_8bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Integer n=sc.nextInt();
		String s=Integer.toBinaryString(n);
		if(s.length()==8)
			System.out.println(s);
		else {
			for(int i=0;i<8-s.length();i++)
				System.out.print("0");
			
			System.out.println(s);
		}
	}

}
