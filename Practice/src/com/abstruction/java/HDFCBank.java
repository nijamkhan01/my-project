package com.abstruction.java;

public class HDFCBank extends Bank {
	void savings() {
		System.out.println("Tumpa Bibi Savings Account");
	}

	void current() {
		System.out.println("Current");
	}

	void salary() {
		System.out.println("salary");
	}

	void joint() {
		System.out.println("joint");
	}

	void branchDetails() {
		System.out.println("Murshidabad");
	}

	public static void main(String[] args) {
		Bank hb = new HDFCBank();
		hb.savings();
		hb.current();
		hb.salary();
		hb.joint();
		hb.branchDetails();
	}

}
