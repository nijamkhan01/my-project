package String;

import java.util.*;

public class StringReverse {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your string: ");
		String strInput = sc.nextLine();
		System.out.println("The Input String: " + strInput);
		System.out.println("The Reversed String: " + reverseString(strInput));
		StringReverse obj=new StringReverse();
		obj.reverse(strInput);
		
	}

	public static String reverseString(String strOriginal) {
		String strReversed = "";
		for (int i= strOriginal.length()-1;i>=0; i--) {
			strReversed += strOriginal.charAt(i);
		}
		return strReversed;
	}
	
	public void reverse(String strValue) {
		String strReversed="";
		for(int i=0;i<strValue.length();i++) {
			strReversed=strValue.charAt(i)+strReversed;
		}
		System.out.println(strReversed);
	}

}
