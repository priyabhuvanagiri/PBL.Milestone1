package com.wipro.flowcontrolstatements;

public class Example7 {
	public static void main(String[] args) {
		char c=args[0].charAt(0);
		int a=(int)c;
		if(c>='a'&&a<='z')
		{
		a=a-32;
		System.out.println((char)a);
		}
		if(c>='A'&&c<='Z')
		{
			a=a+32;
			System.out.println((char)a);
		}
			
			
	}

}

	