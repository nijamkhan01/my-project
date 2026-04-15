package JavaTutorialPoint;

public class Bike {
	int year;
	String model;
	void display() {
		System.out.println("Years: "+year+" "+"Model: "+model);
	}
	public static void main(String[] args) {
		Bike b=new Bike();
		b.display();
	}

}
