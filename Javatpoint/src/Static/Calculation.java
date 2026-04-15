package Static;

public class Calculation {
	static int Cube(int x) {
		return x*x*x;
	}
	public static void main(String[] args) {
		int result=Calculation.Cube(5);
		System.out.println(result);
	}

}
