package com.wipro.bank.acc;

public class RDAccount extends Account{
		  public RDAccount(int tenure, float principal)
		  {
		    super(tenure,principal);
		  }

		  public float calculateAmountDeposited()
		  {
		    return getPrincipal()*getTenure()*12;
		  }
		  public float calculateInterest()
		  {
		    float val=0.0f;
		    float rate=getRateOfInterest()/100;
		    rate=1+(rate/4);
		    float an=getPrincipal();
		    for(int i=getTenure()*12;i>=1;i--)
		    {
		      float crate=(i/12.0f);
		      crate=(float)(Math.pow(rate, 4*crate))-1;
		      val+=an*crate;
		    }
		    return val;
		  }

}
