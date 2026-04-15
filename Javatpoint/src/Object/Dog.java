package Object;

public class Dog {
	String name;
	void bark() {
		System.out.println("Dog can bark.");
	}
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.name="Leo"; 
		d.bark();
		
	}

}
