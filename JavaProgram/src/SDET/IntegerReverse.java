package SDET;

public class IntegerReverse {
	public static void main(String[] args) {
		int n=22300;
//		int rev=0;
//		while(n>0) {
//			int digit=n%10;
//			rev=rev*10+digit;
//			n=n/10;
//		}
//		System.out.println(rev);
		String str = Integer.toString(n);
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		System.out.println(rev);
		int index = 0;
		while (index < rev.length() && rev.charAt(index) == '0') {
			index++;
		}
		String strFinal = rev.substring(index);
		System.out.println(strFinal);
	}

}
