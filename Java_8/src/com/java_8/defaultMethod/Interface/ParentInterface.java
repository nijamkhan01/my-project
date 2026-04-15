package com.java_8.defaultMethod.Interface;

public interface ParentInterface {
	default void sayHello() {
		System.out.println("Hello");
	}

}
