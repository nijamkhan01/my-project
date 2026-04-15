package JavaTutorialPoint;

public class ConstructorOverloading {
	int rollNo;
	String name;
	int age;

	ConstructorOverloading(int r, String n) {
		rollNo = r;
		name = n;
	}

	ConstructorOverloading(int r, String s, int a) {
		rollNo = r;
		name = s;
		age = a;
	}

	void display() {
		System.out.println("Roll No: " + rollNo + " " + "Name: " + name + " " + "Age: " + age);
	}

	public static void main(String[] args) {
		ConstructorOverloading c = new ConstructorOverloading(111, "Nijam");
		ConstructorOverloading c1 = new ConstructorOverloading(222, "Khan", 22);
		c.display();
		c1.display();
	}
}
