package com.demo;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int sub1 = 88;                            //initializing subject1 marks                        
	     int sub2 = 80;
	     int sub3 = 78;
	     int sub4 = 44;
	     int sub5 = 68;
	     
	     int total = (sub1+sub2+sub3+sub4+sub5);
	     float p = (float)total;                    // typecasting
	     float percentage = (float) ((p/500.0)*100.0);
	     
	     System.out.println("Percentage : "+ percentage);   // printing percentage

	     System.out.println("Total : "+ total);     // printing total
	     
	}

}
