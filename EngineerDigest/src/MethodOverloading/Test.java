package MethodOverloading;

public class Test {
	public static void main(String[] args) {
		int arr[] = { 1, 4, 7, 8 };
		int z = sumOfArray(arr);
		System.out.println(z);

		String result = UpperFun("Nijam");
		System.out.println(result);

		int a = Sum(7, 9);
		System.out.println(a);

		int b = Sum(7, 9, 4);
		System.out.println(b);
	}

	public static int sumOfArray(int[] arr) {
		int result = 0;
		for (int i : arr) {
			result = result + i;
		}
		return result;
	}

	private static String UpperFun(String str) {
		return str.trim().toUpperCase();
	}

	private static int Sum(int a, int b) {
		int sum = a + b;
		return sum;
	}

	private static int Sum(int a, int b, int c) {
		int sum = a + b + c;
		return sum;
	}

}
