package com.wipro.overridingpolymorphism;


public class Fruit {


		  char name,taste,size;
		  
		  public static void main(String args[])
		  {
		    Apple a=new Apple();
		    a.eat();
		    Orange o=new Orange();
		    o.eat();
		  }
		  void eat()
		  {
		    System.out.println("fruit name:Banana");
		    System.out.println("fruit taste:sweet");
		  }
		}
		class Apple extends Fruit{
		  void eat()
		  {
		    System.out.println("fruit name:Orange");
		    System.out.println("fruit taste:sweet");
		  }
		}
		class Orange extends Fruit{
		  void eat()
		  {
		    System.out.println("fruit name:Apple");
		    System.out.println("fruit taste:sour");
		  }
		}
