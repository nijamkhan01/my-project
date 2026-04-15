package com.oops;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("Hello World");
//		Person p1 = new Person();	
//		p1.name = "Nijam";
//		p1.age = 26;
//		System.out.println("Name is : " + p1.name + ", age : " + p1.age);
//		
//		Person p2 = new Person();
//		p2.name = "Sourav";
//		p2.age = 24;
//		System.out.println("Name is : " + p2.name + ", age : " + p2.age);
		
		Person p3 = new Person("Riju",27);
		
		System.out.println("Name is : " + p3.name + ", age : " + p3.age);


//		p1.walk();
//		p2.eat();
//		p1.walk(80);
		
		System.out.println(Person.count);
	}
}

class Person {
	String name;
	int age;
	static int count;
	
	public Person() {
		count++;
		System.out.println("creating an object");
	}
	public Person(String newName,int newAge) {
		this();
		name=newName;
		age=newAge;
	}

	void walk() {
		System.out.println(name + " is walking");
	}

	void eat() {
		System.out.println(name + " is eating");
	}

	void walk(int steps) {
		System.out.println(name + " " + steps + " steps walked");
	}
}
