package JavaTutorialPoint;

public class ParameterizedConstructor {
	int id;
	String name;

	ParameterizedConstructor(int i, String n) {
		id = i;
		name = n;

	}

	void display() {
		System.out.println("Id: " + id + " " + "Name: " + name);
	}

	public static void main(String[] args) {
		ParameterizedConstructor p = new ParameterizedConstructor(111, "Nijam");
		p.display();
	}

}
