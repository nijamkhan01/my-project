package SnippedCode;

public class Question1 {
	public static void main(String[] args) {
		try {
			System.out.print("Hello" + " " + 1 / 0);
			System.exit(0);
			return;
		}catch (Exception e) {
			System.out.println("Catch");
		}finally {
			System.out.println("Finally");
		}
	}

}
