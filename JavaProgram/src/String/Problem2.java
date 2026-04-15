package String;

import java.util.Arrays;

public class Problem2 {
	public static void main(String[] args) {
		int n=121;
//		System.out.println(n%2);
//		String str="Java Programming Language";
//		String a[]=str.split(" ");
//		System.out.println("Array is: "+Arrays.toString(a));
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//			for(int j=i+1;j<a.length;j++) {
//				System.out.println(a[j]);
//			}
//		}
//		int o=n;
//		int temp=0;
//		while(n!=0) {
//			int digit=n%10;
//			temp=temp*10+digit;
//			n=n/10;
//		}
//		if(o==temp) {
//			System.out.println("Palindrome");
//		}
		int o=n;
		int sum=0;
		while(n!=0) {
			int digit=n%10;
			sum=sum+digit;
			n=n/10;
			System.out.println("n: "+n);
		}
			System.out.println("Sum: "+sum);
	}
	
	// Count each character

}
