package com.wipro.eb.entity;


public class Commercial extends Connection{
	public Commercial()
	{
		
	}
	public Commercial(int currReading,int prevReading,float[] slabs)
	{
		super(currReading,prevReading,slabs);
	}
	public float computeBill()
	{
		int units=getCurrentReading()-getPreviousReading();
		float bill=0;
		if(units>50)
		{
			units=units-50;
			bill+=50*getSlabs()[0];
			if(units>50)
			{
				units=units-50;
				bill+=50*getSlabs()[1];
				bill+=units*getSlabs()[2];
			}
			else
			{
				bill+=units*getSlabs()[1];
			}
			
		}
		else
		{
			bill=units*getSlabs()[0];
		}
		if(bill>=10000f)
			return bill*0.09f;
		else if(bill>=5000f)
			return bill*0.06f;
		else
			return bill*0.02f;
	}

}



