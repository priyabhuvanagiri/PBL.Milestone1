package com.mile1.main;
import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;
public class StudentMain {
    static Student data []=new Student[4];
    StudentMain () 
    {
      for (int i=0;i<data.length;i++) 
      {
       data [i]= new Student();
      }
       data [0] = new Student("Sekar", new int [] {85,75,95});
       data [1] = new Student(null, new int[]{11,22,33});
       data [2] = null;
       data [3] = new Student("Manoj", null);
    }
    public static void main(String[] args)
    {
      StudentMain s=new StudentMain();
      StudentReport a=new StudentReport();
        for(int i=0;i<data.length;i++)
      {
          try
          {
        a.validate(data[i]);
        System.out.println(a.findGrade(data[i]));
          }  
          catch(NullNameException e)
          {
            //e.printStackTrace();
            System.out.println(e);
          }
          catch(NullMarksArrayException e)
          {
            //e.printStackTrace();
            System.out.println(e);
          }
          catch(NullStudentObjectException e)
          {
            //e.printStackTrace();
            System.out.println(e);
          }
          
      }
      StudentService b=new StudentService();
      System.out.println("Number of null marks array: "+b.findNumberOfNullMarksArray(data));
      System.out.println("Number of null names: "+b.findNumberOfNullName(data));
      System.out.println("Number of null objects: "+b.findNumberOfNullObjects(data));
      }
}
