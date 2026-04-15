package Loop;

public class Loop {

	public static void main(String[] args) {

		// int i=0;
//		while(i<10) {
//			System.out.println(i+". Hello World");
//			i++;
//		}

//		do {
//			System.out.println("Hello world");
//		}while(i<10) {
//			System.out.println("Hello Nijam");
//		}

//	for (int i = 1, j = 1; j <= 6; i = i * 10, j++) {
//		System.out.println(i);
//	}
		// print 7 table
//	for(int i=1;i<=10;i++) {
//		System.out.println(i+" x 7 = "+i*7);
//	}

		// sum of first 10 natural number
//		int sum=0;
//		for(int i=1;i<=10;i++) {
//			sum=sum+i;
//		}
		// System.out.println(sum);

		// count number of digit
//		int n=647585996;
//		int res=0;
//		while(n>0) {
//			n=n/10;
//			res++;
//		}
//		System.out.println(res);

		// factorial
		int num = 5, factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
	}
}
