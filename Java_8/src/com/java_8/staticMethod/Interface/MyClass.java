package com.java_8.staticMethod.Interface;

interface A{
	static void sayHello() {
		System.out.println("A say hello");
	}
	default void sayBye() {
		System.out.println("A say bye");
	}
}

public class MyClass implements A{
	static void sayHello() {
		System.out.println("my class say Hello");
	}
	@Override
	public void sayBye() {
		System.out.println("my class say bye");
	}
	public static void main(String[] args) {
		MyClass myClass=new MyClass();
		myClass.sayBye();
		myClass.sayBye();
		A.sayHello();//we can call static method by using interface name //only and one way
		MyClass.sayHello();
	}

}
