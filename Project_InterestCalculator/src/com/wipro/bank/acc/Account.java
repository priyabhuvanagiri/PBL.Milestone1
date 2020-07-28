package com.wipro.bank.acc;

public abstract class Account {
	 private int tenure;
	  private float principal;
	  private float rateOfInterest;
	  public Account()
	  {
	    
	  }
	  public Account(int tenure,float principal)
	  {
	    this.tenure=tenure;
	    this.principal=principal;
	  }
	  
	  public int getTenure() {
	    return tenure;
	  }
	  public void setTenure(int tenure) {
	    this.tenure = tenure;
	  }
	  public float getPrincipal() {
	    return principal;
	  }
	  public void setPrincipal(float principal) {
	    this.principal = principal;
	  }
	  public float getRateOfInterest() {
	    return rateOfInterest;
	  }
	  public void setRateOfInterest(int age,String gender) {
	    if(gender.equals("Male"))
	    {
	      if(age<60)
	      {
	        this.rateOfInterest=9.8f;
	      }
	      else
	      {
	        this.rateOfInterest=10.5f;
	      }
	    }
	    else
	    {
	      if(age<58)
	      {
	        this.rateOfInterest=10.2f;
	      }
	      else
	      {
	        this.rateOfInterest=10.8f;
	      }
	    }
	  }
	  
	  public float calculateMaturityAmount(float totalPrincipleDeposited,float maturityInterest)
	  {
	    return totalPrincipleDeposited+maturityInterest;
	  }
	  public abstract float calculateInterest();
	  public abstract float calculateAmountDeposited();
}
