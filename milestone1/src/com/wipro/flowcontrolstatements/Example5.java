package com.wipro.flowcontrolstatements;

public class Example5 {
 public static void main(String[] args) {
	 char c=args[0].charAt(0);
	if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
			System.out.println("alphabet");
	else if((int)c>=48&&(int)c<=57)
		System.out.println("digit");
	else 
	System.out.println("special character");
		
	
}
}
