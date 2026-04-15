package com.nijam;

public class Casting {
	//casting
	int p=100;
	int fp= p+ (int)18.00;
	
	void priceCasting(){
	double price=100.00;
	double finalPrice=price+18;
	System.out.println(finalPrice);
	System.out.println(fp);
	}
	
   public static void main(String[] args) {
	   Casting cs=new Casting();
	   cs.priceCasting();
	   cs.p=200;
	   System.out.println(cs.p);
	   
	   
	
}

}
