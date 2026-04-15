package MethodOverloading;

public class Test1 {
	public static void main(String[] args) {
		int x=10;
		System.out.println(multiplyBy10(x));
		System.out.println(x);
		
	}
	
	public static int multiplyBy10(int x) {
		return x*10;
	}

}
