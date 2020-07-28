package com.wipro.flowcontrolstatements;

public class Example12 {
	public static void main(String[] args) {
		int count=0;
		int a=Integer.parseInt(args[0]);
		for(int x=1;x<=a/2;x++)
		{
			if(a%x==0)
			{
				count++;
			}
		}
			if(count>2)
				System.out.println("not a prime");
			else
				System.out.println("prime");
			
		
	}

}
