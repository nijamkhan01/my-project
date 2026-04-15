package com.oops;

class Tester {
	int intSalary;

	public Tester() {
		System.out.println("Tester constructor called");
	}

	void employee() {
		intSalary = 10000;
		System.out.println("Employee Salary " + intSalary);
	}
}

class Programmer extends Tester {
	int reward;
	int intBonus;

	public Programmer() {
		System.out.println("Programmer Constructor called");
	}

	public Programmer(int newreward) {
		this();
		System.out.println("Second Programmer Constructor called");
		reward = newreward;
	}

	void bonus() {
		intBonus = 1000;
		System.out.println("Programmer bonus " + intBonus);
	}
}

class Analyst extends Programmer {
	String strName;

	public Analyst() {
		System.out.println("Analyst constructor called");
	}

	void name() {
		strName = "Nijam";
		System.out.println("Analyst name " + strName);
	}
}

class Developer extends Tester {
	String strRole;

	public Developer() {
		System.out.println("Developer constructor called");
	}

	void Role() {
		strRole = "Full Stack Developer";
		System.out.println("Role is " + strRole);
	}
}

public class Inheritance {

	public Inheritance() {
		System.out.println("Constructor called");
	}

	public static void main(String[] args) {

//		Tester t1=new Tester();
//		t1.employee();

//		Programmer p1 = new Programmer();
//		p1.employee();
//		p1.bonus();
//		Programmer p2 = new Programmer(2000);
//		System.out.println(p2.reward);

//		Analyst e1 = new Analyst();
//		e1.name();
//		e1.employee();
//		e1.bonus();

		Developer d1 = new Developer();
		d1.employee();
		d1.Role();
	}

}
