package com.wipro.flowcontrolstatements;

public class Example8 {
public static void main(String[] args) {
	char color=args[0].charAt(0);
	switch (color)
	{
	case 'R':System.out.println("red");
	break;
	case 'B':System.out.println("blue");
	break;
	case 'Y':System.out.println("yelloe");
	break;
	case 'O':System.out.println("orange");
	break;
	case 'w':System.out.println("white");
	break;
	case 'G':System.out.println("green");
	break;
	default:System.out.println("invalid");
	}
}
}
