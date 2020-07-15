package iostream_pbl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class CountCharacter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);	
		int c=0;
		try {
		FileReader fr=new FileReader("line.txt");
		BufferedReader br=new BufferedReader(fr);
		String s=br.readLine();
		char ch=sc.next().charAt(0);
			for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==ch) {
				c++;
			}		
		}
		System.out.println(c);
		}catch(IOException e) {
			System.out.println("Exception");
		}
	}
}
