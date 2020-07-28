package com.wipro.encapsulationabstraction;

public class MedicinePrice {
	public static void main(String[] args) {
		int[] arr=new int[] {72,97,112,112,121,66,105,114,116,104,100,97,121};
		for(int i=0;i<arr.length;i++) {
			System.out.print((char)arr[i]);
			if(arr[i]==121)
				System.out.print(" ");
		}
		int[] arr2=new int[] {75,114,105,115,104,110,97};
		for(int i=0;i<arr2.length;i++) 
			System.out.print((char)arr2[i]);
		System.out.println("\n");
		
		for(int i=1;i<=7;i++) { 
			for(int j=1;j<=7;j++)
        {
				System.out.print(" ");
		if(i==1&&j==2||i==1&&j==3||i==1&&j==5||i==1&&j==6||i==2&&j==1||i==2&&j==4||i==2&&j==7||i==3&&j==1||i==3&&j==7||i==4&&j==1||i==4&&j==7||i==5&&j==2||i==5&&j==6||i==6&&j==3||i==6&&j==5||i==7&&j==4)
        {
        	System.out.print("*");
        }
        else
        {
        	System.out.print(" ");
        }
       }
        System.out.print("\n");
			
		}
		int[] s= new int[]{6,2,5,3,1,4};
		int c;
		for(int k=0;k<6;k++) {
			 c=s[k];
			 switch(c) {
			 case 1: System.out.print(" m"+(char)(89));
			 break;
			 case 2: System.out.print((char)(65)+" ");
			 break;
			 case 3: System.out.print((char)68+"a"+(char)89);
			 break;
			 case 4: System.out.println(" B"+(char)101+"S"+(char)116+"I"+(char)101);
			 break;
			 case 5: System.out.print((char)71+""+(char)114+""+(char)69+"aT ");
			 break;
			 case 6: System.out.print((char)72+"aV"+(char)101+" ");
			 break;
			 default:
				 System.out.print("null");
			 }
		}
	}

}
