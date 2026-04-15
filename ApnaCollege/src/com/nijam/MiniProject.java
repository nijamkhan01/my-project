package com.nijam;

import java.util.Scanner;

public class MiniProject {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int myNumber=(int)(Math.random()*100);
		int userNumber=0;
		
		do {
			System.out.println("Guess my number(1-100) :");
			System.out.println("Enter you number");
			 userNumber=sc.nextInt();
			 
			if(userNumber==myNumber){
				System.out.println("This is correct number");
				break;
			}else if(userNumber>myNumber) {
				System.out.println("Your number is too large");
			}else {
				System.out.println("Your number is small");
			}
		}while(userNumber>=0);
		System.out.println("My number was : "+myNumber);
	}

}
