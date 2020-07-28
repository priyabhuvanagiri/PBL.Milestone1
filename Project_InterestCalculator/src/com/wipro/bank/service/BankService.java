package com.wipro.bank.service;
import com.wipro.bank.acc.RDAccount;
import com.wipro.bank.exception.*;
public class BankService {
  public boolean validateData(float principal, int tenure,int age, String gender)
  {
    try
    {
      if(principal<500)
        throw new BankValidationException();
      if(!((tenure==5)||(tenure==10)))
        throw new BankValidationException();
      if(!(gender.equalsIgnoreCase("Male")||gender.equalsIgnoreCase("Female")))
        throw new BankValidationException();
      if(!(age>1&&age<100))
        throw new BankValidationException();
      return true;
    }
    catch(BankValidationException e)
    {
      System.out.println(e);
      return false;
    }
  }
  public void calculate(float principal,int tenure, int age, String gender)
  {
    if(validateData(principal,tenure,age,gender)==true)
    {
      RDAccount a=new RDAccount(tenure,principal);
      a.setRateOfInterest(age, gender);
      System.out.println("Rate of Interest:"+a.getRateOfInterest());
      System.out.println("Interest: "+a.calculateInterest());
      System.out.println("Amount Deposited: "+a.calculateAmountDeposited());
      System.out.println("Maturity Amount: "+a.calculateMaturityAmount(a.calculateAmountDeposited(), a.calculateInterest()));
      
      
    }
  }
}
