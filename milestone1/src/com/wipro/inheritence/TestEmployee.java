package com.wipro.inheritence;

public class TestEmployee {
	public static void main(String[] args) {
	  Employee e=new Employee();
	  e.setName("Priya");
	  e.setAnnualsal(900000.00);
	  e.setYr(2020);
	  e.setInsurenum("12345");
	  System.out.println(e.getName());
	  
	  System.out.println(e.getYr());
	  System.out.println(e.getInsurenum());
	}
	}
	class Person{
	  String name;
	  String getName() {
	    return name;
	  }
	  void setName(String name)
	  {
	    this.name=name;
	  }
	}

	class Employee extends Person{
	  double annualsal;
	  int yr;
	  String insure_num;
	  
	double getAnnualsal(double annualsal) {
	return annualsal;
	}

	void setAnnualsal(double annualsal) {
	  this.annualsal=annualsal;
	}
	int getYr() {
	  return yr;
	}
	void setYr(int yr) {
	  this.yr=yr;
	}
	String getInsurenum() {
	  return insure_num;
	}
	void setInsurenum(String insure_num)
	{
	  this.insure_num=insure_num;
	}
	}

