package com.nijam;

public class Constant {
//Constant
	int age = 30;
	final float PI = 3.14F;
	// Operator
	int a = 10;
	int b = 20;
	int sum = a + b;
	int div = b / a;
	int diff = a - b;
	double c = 5;
	double d = 3;
	double mod = a % b;
	int num=1;
	

	public static void main(String[] args) {
		Constant cnst = new Constant();
		cnst.age = 32;
		System.out.println(cnst.age);
		System.out.println(cnst.sum);
		System.out.println(cnst.div);
		System.out.println(cnst.diff);
		System.out.println(cnst.d);
		//increment
		System.out.println(cnst.num++);
		System.out.println(++cnst.num);
		//decrement
		System.out.println(cnst.num--);
		System.out.println(--cnst.num);
		//math
		System.out.println(Math.max(8, 3));
		System.out.println(Math.min(8, 3));
		System.out.println(Math.random());
		
		
		
	}

}
