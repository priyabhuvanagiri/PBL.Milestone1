package com.wipro.flowcontrolstatements;

public class Example14 {
public static void main(String[] args) {
	
	char a=args[0].charAt(0);
	int x=(int)a;
	int sum=0,rem=0,temp=0;
	while(x>0)
    {
        rem = x%10;
        sum = sum+rem;
        x = x/10;
    }
	
    System.out.print("Sum of Digits of " +temp+ " is : " +sum);
	
}
}
