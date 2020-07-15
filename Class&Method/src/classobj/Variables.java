package classobj;

public class Variables {
	
		double h,w,d;
		public void initial(double h,double w,double d)
		{
			this.h=h;
			this.w=w;
			this.d=d;
			
		}
		public void display()
		{
			System.out.println("Volume of the box: "+(h*w*d));
		}
	}
