package com.nijam;

import java.util.Scanner;

public class Loop {
	int num=100;
	void printNumber() {
		for(int i=num;i>=1;--i) {
			System.out.println(i);
		}
	}
	void whileLoop() {
		while(num>=1) {
			System.out.println(num);
			num=num-1;
		}
	}
	void doWhile() {
		int digit;
		Scanner sc= new Scanner(System.in);
		do {
			System.out.println("Enter your number");
			 digit=sc.nextInt();
			System.out.println("number is : "+digit);
		}while(digit>=0);
			System.out.println("THE END");
		
	}
	public static void main(String[] args) {
		Loop lp=new Loop();
		//lp.printNumber();
		//lp.whileLoop();
		lp.doWhile();
	}
}
