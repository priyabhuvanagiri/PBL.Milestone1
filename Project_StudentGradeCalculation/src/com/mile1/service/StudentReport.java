package com.mile1.service;
import com.mile1.bean.*;
import com.mile1.exception.*;
public class StudentReport {
	 public String findGrade(Student studentObject){
		    int sum=0;
		    for(int i=0;i<studentObject.getMarks().length;i++)
		    {
		      if(studentObject.getMarks()[i]<35)
		      {
		        studentObject.setGrade("F");
		        return "F";
		      }
		      sum+=studentObject.getMarks()[i];
		    }
		    if(sum>=250)
		    {
		      
		      studentObject.setGrade("A+");
		      return "A+";
		    }
		    if(sum>=200&&sum<250)
		    {
		      studentObject.setGrade("A");
		      return "A";
		    }
		    if(sum>=150&&sum<200)
		    {
		      studentObject.setGrade("B");
		      return "B";
		    }
		    else
		    {
		      studentObject.setGrade("C");
		      return "C";
		    }  
		  }
		  public String validate(Student s)throws NullNameException,NullMarksArrayException,NullStudentObjectException
		  {
		    if(s==null)
		      throw new NullStudentObjectException();
		    else
		    {
		      if(s.getName()==null)
		        throw new NullNameException();
		      if(s.getMarks()==null)
		        throw new NullMarksArrayException();
		      else
		        return "VALID";
		      
		    }
		  }
}
