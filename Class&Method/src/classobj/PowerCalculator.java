package classobj;

public class PowerCalculator {
	int num1,num2;
	double c,d;
	PowerCalculator(int a,int b)
	{
		num1=a;
		num2=b;
	} 
	double getpower()
	{	 
      return Math.pow(num1,num2);
	}
	public void setC(double c)
	{
		this.c=c;
	}
	public double getC(double c)
	{
		return c;
	}
	public void setD(double d)
	{
		this.d=d;
	}
	public double getD(double d)
	{
		return d;	
	}
	double getpower2() {
		return Math.pow(c, d);
	}
 
		public static void main(String[] args) {
			PowerCalculator ci=new PowerCalculator(2,3);
			System.out.println(ci.getpower());
			ci.setC(2.3);
			ci.setD(2.1);
			System.out.println(ci.getpower2());
			
			
		}
}


