package com.wipro.languagebasics;

public class Test {
	public static void main(String[] args)
	{
		int i,num=12,flag=0;
		for( i=0;i<num;i++)
		{
			if((i*(i+1))==num)
			{
				flag=1;
			System.out.println((i));
			System.out.println(i-1);
			}
			
		}
		if(flag==1)
			
				System.out.println((int)num+"is a pronic number");
			else
				System.out.println("not pronic");
		}
	}


