package Number;

public class Prime {
	public static void main(String[] args) {
		int num=13;
		for(int i=2;i<=num/2;i++) {
			//System.out.println(i);
			System.out.println(num/10);
			if(num%i==0) {
			System.out.println("not prime");
			}else {
				System.out.println("Prime");
			}
		}
	}

}
