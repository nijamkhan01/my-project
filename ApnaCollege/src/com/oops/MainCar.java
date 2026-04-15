package com.oops;

public class MainCar {
	String brand;
	int year;
	
	public MainCar(String brand) {
		this(brand, 2020);
	}
	
	public MainCar(String brand,int year) {
		this.brand=brand;
		this.year=year;
	}
	
	public void printInfo() {
	    System.out.println(brand + " " + year);
	    this.brand=brand;
	  }
	
	public static void main(String[] args) {
		MainCar m1=new MainCar("TATA",2025);
		m1.printInfo();
		
		MainCar m2=new MainCar("Thar");
		m2.printInfo();
	}

}
