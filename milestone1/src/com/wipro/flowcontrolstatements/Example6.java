package com.wipro.flowcontrolstatements;

public class Example6 {
public static void main(String[] args) {
	String a=args[0];
	int b=Integer.parseInt(args[1]);
	if(a.equals("female"))
	{
		if(b>=1&&b<=58)
			System.out.println("8.2%");
		else 
			System.out.println("9.2%");
	}
	else if(a.equals("male"))
	{
		if(b>=1&&b<=58)
			System.out.println("8.4%");
		else
			System.out.println("10.5%");
	}
}
}
