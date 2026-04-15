package oops;

public class CarClassAndObject {
	String color;
	String brand;
	String model;
	int year;
	int speed;
	
	public void accelerate(int increment) {
		speed+=increment;
	}
	public void brake(int decrement) {
		speed-=decrement;
	}
	

}
