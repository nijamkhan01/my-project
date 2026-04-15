package com.programming;

import java.util.*;

public class MultiplicationTable {
	
	void table(int num) {
		for (int i = 1; i <= num; i++) {
			int temp = 0;
			System.out.println(temp = num * i);
		}
	}

	void table1(int num) {
		for (int i = 1; i <= 10; ++i) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}
	
	void table2(int num,Integer...val) {
		int i=1;
		if(val.length!=0) {
		i=val[0];	
		}
		 if (i == 11) 
	            return;
	        System.out.println(num + " * " + i + " = " + num * i);
	        i++; 
	        table2(num, i);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int num = sc.nextInt();
		MultiplicationTable obj = new MultiplicationTable();
		obj.table(num);
		obj.table1(num);
		obj.table2(num);
	}
}
