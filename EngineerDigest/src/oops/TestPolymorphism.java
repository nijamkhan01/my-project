package oops;

public class TestPolymorphism {
	public static void main(String[] args) {
		AnimalPlolymorphism a= new CatPloymorphism();
		a.makeSound();
		AnimalPlolymorphism ab=new DogPolymorphism();
		ab.makeSound();
	}

}
