package com.java_8.functionalInterface;

@FunctionalInterface
public interface parent {
	public void sayHello();

	default void sayok() {
		System.out.println("Say ok");
	};

	public static void sayBye() {
		System.out.println("Say Bye");
	};

}
