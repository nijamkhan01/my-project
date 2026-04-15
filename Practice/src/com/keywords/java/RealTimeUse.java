package com.keywords.java;
class Person{
	int id;
	String name;
	Person(int id, String name){
		this.id=id;//refer to class level variable
		this.name=name;
	}
}
class Employee extends Person{
	float salary;
	public Employee(int id, String name, float salary) {
		super(id, name);//to call parent class constructor
		this.salary=salary;
	}
	void display() {
		System.out.println("ID: "+id+", Name: "+name+", Salary: "+ salary);
	}
}

public class RealTimeUse {

	public static void main(String[] args) {
		Employee e= new Employee(1,"Nijam",1000.0f);
		e.display();
				

	}

}
