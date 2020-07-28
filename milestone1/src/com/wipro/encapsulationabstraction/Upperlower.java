package com.wipro.encapsulationabstraction;

public class Upperlower {
	public static void main(String[] args) {
		
	
	String s="Hi HeLlo PlEase";
	StringBuffer str=new StringBuffer(s);
	for(int i=0;i<str.length();i++)
	{
		if((int)i>=65 &&(int) i<=90){
		if(Character.isLowerCase(s.charAt(i))) {      
              str.setCharAt(i, Character.toUpperCase(s.charAt(i)));    
          }     
          else if(Character.isUpperCase(s.charAt(i))) {    
              str.setCharAt(i, Character.toLowerCase(s.charAt(i)));    
          }    
      }    
     // System.out.println( str);    
		
	}
			
	}
}

