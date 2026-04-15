package com.java_8.defaultMethod.Interface;

interface A{
	default void sayHello() {
		System.out.println("A Say Hello");
	}
}
interface B{
	default void sayHello() {
		System.out.println("B Say Hello");
	}
}

public class MyClass implements A,B {//it will gives error for ambiguity reason
	public static void main(String[] args) {
		ChildDefaultInterface c = new ChildDefaultInterface();
		c.sayHello();
		
		MyClass myClass= new MyClass();
		myClass.sayHello();
	}
	@Override
	public void sayHello() {
		B.super.sayHello();
	}
//	@Override
//	public void sayHello() {
//		System.out.println("my Class Say HEllo");
//	}

}
