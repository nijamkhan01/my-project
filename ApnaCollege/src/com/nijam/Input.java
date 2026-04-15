package com.nijam;
import java.util.*;

public class Input {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter Your Age : ");
//		int age=sc.nextInt();
//		System.out.println("Your Age : "+age);
//		System.out.println("Enter your Name : ");
//		String name=sc.nextLine();
//		System.out.println("your Name : "+name);

		//Comparison Operator
		//a==b 
		//a!=b
		//a<b
		//a>b
		//a<=b
		//a>=b
		boolean isSunUp=false;
		if(isSunUp==true) {
			System.out.println("Day");
		}else {
			System.out.println("false");
		}
		int age=15;
		if(age>18) {
			System.out.println("Can Vote");
		}else {
			System.out.println("Can not vote");
		}
		int a=30;
		int b=40;
		if(a<50 && b>50) {
			System.out.println("Both less than 50");
		}else if(a<50||b>60) {
			System.out.println("Atleast one less than 50");
		}
		
		boolean isAdult=true;
		if(!isAdult)
			System.out.println("is Adult");
		else
			System.out.println("not adult");
		
		
		
	}

}
