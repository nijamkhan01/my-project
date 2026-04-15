package com.java_8.use.lamda.Interface;

public class Main {
	public static void main(String[] args) {
//		Employee employee=new SoftwereEngineer();
//		System.out.println(employee.getName());
		
		Employee se =()->"Softwere Engineer";{
			System.out.println(se.getName());
		};
		
		Employee editor =()->"Editor ";{
			System.out.println(editor.getName());
		};
	}

}
