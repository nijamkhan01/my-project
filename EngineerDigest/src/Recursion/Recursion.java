package Recursion;

public class Recursion {
	public static void main(String args[]) {
		System.out.println(factorial(5));
	}

//	public static int factorial(int num) {
//		int fact = 1;
//		for (int i = 1; i <= num; i++) {
//			fact = fact * i;
//		}
//		return fact;
//	}
	public static int factorial(int num) {
		if (num == 1) {
			return 1;
		}
		return num * factorial(num - 1);
	}
}
