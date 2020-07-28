package com.wipro.flowcontrolstatements;

public class Example13 {
	public static void main(String[] args) {
		for( int x=11;x<99;x++)
		{
			int count=0;
			for(int j=1;j<=x; j++)
			{	
				if(x%j==0)
					count++;
			}
				if(count==2)
					System.out.println(x);		
		}							
	}
}
