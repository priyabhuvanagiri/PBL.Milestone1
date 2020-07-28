package com.wipro.abstractclasses;

	abstract class Compartment {
		abstract void notice();
	}
	class FirstClass extends Compartment
	{
	void notice()
	{
		System.out.println("Its FIRSTCLASS");
		}
	}
	class Ladies extends Compartment
	{
	void notice()
	{
		System.out.println("Its LADIES Compartment");
		}
	}
	class General extends Compartment
	{
	void notice()
	{
		System.out.println("Its GENERAL Compartment");
		}
	}
	class Luggage extends Compartment
	{
	void notice()
	{
		System.out.println("Its LUGGAGE");
		}
	}

