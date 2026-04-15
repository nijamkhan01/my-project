package SnippedCode;

public class Question8 {
	static void change(int x) {
		x = 100;
	}
	public static void main(String[] args) {
		int a = 50;
		change(a);
		System.out.println(a);
	}
}
/**
 * void change(int x) {
 *  x=100; 
 *  } 
 *  int a=50;
 *   change(a); 
 *   System.out.println(a); 
 *   }
 **/