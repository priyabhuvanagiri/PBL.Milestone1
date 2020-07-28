package com.wipro.eb.service;
import com.wipro.eb.exception.*;
import com.wipro.eb.entity.*;
public class ConnectionService {
	  public  boolean validate(int currReading, int prevReading,String type) throws InvalidReadingException,InvalidConnectionException
	  {
	    boolean a=false;
	    if(currReading<prevReading||currReading<0||prevReading<0)
	    {
	      throw new InvalidReadingException();
	    }
	    else if(!((type.equals("Domestic"))||(type.equals("Commercial"))))
	    {
	      throw new InvalidConnectionException();
	    }
	    else
	    {
	      a=true;
	    }
	    return a;
	    
	  }
	  public  float calculateBillAmt(int currReading,int prevReading,String type)
	  {
	    float res=0.0f;
	    try
	    {
	    if((validate(currReading,prevReading,type))==true)
	    {
	      if(type.equals("Domestic"))
	      {
	        Domestic d=new Domestic(currReading,prevReading,new float[] {2.3f,4.2f,5.5f});
	        res= d.computeBill();
	      }
	      else
	      {
	        Commercial c=new Commercial(currReading,prevReading,new float[] {5.2f,6.8f,8.3f});
	        res= c.computeBill();
	      }
	    }
	    }
	    catch(InvalidReadingException e)
	    {
	      System.out.println(e);
	      res= -1.0f;
	    }
	    catch(InvalidConnectionException e)
	    {
	      System.out.println(e);
	      res= -2.0f;
	    }
	    return res;
	  }
	  public String generateBill(int currReading,int prevReading,String type)
	  {
	    float val=calculateBillAmt(currReading,prevReading,type);
	    if(val==-1.0f)
	    {
	      return "Incorrect Reading";
	    }
	    else if(val==-2.0f)
	    {
	      return "Invalid ConnectionType";
	    }
	    else
	    {
	      return "Amount to be paid:"+Float.toString(val);
	    }
	  }
}
