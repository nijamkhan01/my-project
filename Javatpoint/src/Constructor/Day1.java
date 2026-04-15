package Constructor;

public class Day1 {
	int age;
	String name;
	String deg;
	Day1() {
		
	}
	Day1(int a,String s){
		age=a;
		name=s;
	}
	Day1(Day1 d,String y){
		age=d.age;
		name=d.name;
		deg=y;
	}
	
	void display() {
		System.out.println("Age is: "+age);
		System.out.println("Name is: "+name);
		System.out.println("Degree is: "+deg);
	}

	public static void main(String[] args) {

		Day1 d = new Day1();
		d.display();
		Day1 d1=new Day1(22, "Kalyani");
//		d1.display();
		Day1 d2=new Day1(d, "B-Tech");
		d2.display();

	}

}
