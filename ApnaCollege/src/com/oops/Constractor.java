package com.oops;

public class Constractor {
	int x;
	static int y=5;
	String z;
	public Constractor() {
		System.out.println("constractor called to create object");
	}
	
	public Constractor(int newX,String newZ) {
		this();
		System.out.println("Parameterized constractor called to create object");
		x=newX;
		z=newZ;
	}
	
	public static void main(String[] args) {
		System.out.println(y);
		Constractor c1=new Constractor(20,"Jishan");
		System.out.println(c1.x);
		System.out.println(c1.z);
	}

}
