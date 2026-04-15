package Static;

public class Student {
	int rollno;
	int age;
	static String college="SMIT";
	Student(int r, int a){
		rollno=r;
		age=a;
	}
	void display() {
		System.out.println("Roll no: "+rollno+" Age: "+age+" College: "+college);
	}
	
	public static void main(String[] args) {
		Student s=new Student(111, 11);
		s.display();
		Student s1=new Student(222, 22);
		s1.display();
	}

}
