package com.oops;

import com.nijam.Main;

public class MainClass {
	
	String strCar;
	String strModel;
	int year;
	static int count;
	
	public MainClass() {
		count++;
		System.out.println("Constructor called first");
		year=2020;
	}
	
	public MainClass(int Newyear) {
		this();
		System.out.println("Constructor called second");
		year=Newyear;
	}
	
	public MainClass(String strCar) {
		this();
		System.out.println("Single Parameterized constructor created");
		this.strCar=strCar;
	}
	
	public MainClass(String strNewCar,String strNewModel) {
		this();
		System.out.println("Double Parameterized constructor created");
		this.strCar=strNewCar;
		this.strModel=strNewModel;
	}
	
	void printInfo() {
		System.out.println("Car is "+ strCar);
		System.out.println("Model is "+ strModel);
	}

	public static void main(String[] args) {
		MainClass C= new MainClass();
		System.out.println("Model is "+ C.year);
		MainClass C0= new MainClass(2025);
		System.out.println("New year is "+ C0.year);
		MainClass C1= new MainClass();
		C1.printInfo();
		MainClass C2= new MainClass("Tata");
		C2.printInfo();
		MainClass C3= new MainClass("Tata","EV");
		C3.printInfo();
		System.out.println("Count is "+ count);
	}
}
