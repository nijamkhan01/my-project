package com.oops.java;

class Engineer{
	void Degree() {
		System.out.println("Engineer has degree");
	}
}
class Civil extends Engineer{
	void Salary(float slr){
		System.out.println("Civil Engineer salary is: "+slr);
	}
}
public class Inheritance {
public static void main(String[] args) {
	Civil c= new Civil();
	c.Salary(5000.0f);
	c.Degree();
}
}
