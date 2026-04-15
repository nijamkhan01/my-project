package Variable;

public class Number {
	public static void main(String[] args) {
		int num = 13;
		int temp = num / 2;
		System.out.println(temp);
		for (int i = 2; i <= temp; i++) {
			if (num % i == 0) {
				System.out.println("Not prime");
				break;
			}
			if (i == temp) {
				System.out.println("Prime");
			}
		}
	}

}