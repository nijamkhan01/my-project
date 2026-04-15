package oops;

public class CarTest {
	
	public static void main(String[] args) {
		CarClassAndObject car=new CarClassAndObject();
		car.color="blue";
		car.speed=40;
		car.brand="TATA";
		car.year=2026;
		
		car.accelerate(1);
		System.out.println(car.speed);
	}

}
