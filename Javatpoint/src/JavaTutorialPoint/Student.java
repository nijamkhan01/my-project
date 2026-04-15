package JavaTutorialPoint;

public class Student {
	int age;
	String name;
	
	Student(int a, String s){
		age=a;	
		name=s;
	}
	Student(Student s){
		age=s.age;
		name=s.name;
	}
	void display() {
		System.out.println("Age: "+age+", "+"Name: "+name);
	}
    public static void main(String[] args) {
		Student s= new Student(22,"Nijam");
		Student s1= new Student(s);
		//s1=s;
		s1.display();
	}
}
