package com.programming;

import java.util.Scanner;

public class EvenOrOdd {
	public boolean checkNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int num = sc.nextInt();
		int temp = num % 2;
		if (temp == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		EvenOrOdd obj = new EvenOrOdd();
		if (obj.checkNum() == true) {
			System.out.println("The number is even");
		} else {
			System.out.println("The number is odd");
		}
	}

}
