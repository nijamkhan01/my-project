package com.nijam;

import java.util.Arrays;

public class JavaArray {
	int age=30;
	int physics=97;
	int chemistry=98;
	int math=100;
	int eng=95;

	void totalMarks() {
		int[] marks = new int[3];
		marks[0] = 97;
		marks[1] = 98;
		marks[2] = 95;
		System.out.println(marks[0]);
		
		boolean	[] marks1 = new boolean[3];
		System.out.println(marks1[0]);
		
		String	[] marks2 = new String[3];
		System.out.println(marks2[0]);
		
		//length
		System.out.println(marks.length);
		
		//sort
		Arrays.sort(marks);
		System.out.println(marks[0]);
		
		int[]marks3= {78,79,72};
		int[][] finalMarks= {{66,69,63},{89,85,83}};
		System.out.println(finalMarks[0][1]);
	}
	
	
	public static void main(String[] args) {
		
		JavaArray arr=new JavaArray();
		arr.totalMarks();
		
		
	}

}
