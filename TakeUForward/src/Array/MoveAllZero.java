package Array;

import java.util.Arrays;

public class MoveAllZero {
	public static void main(String[] args) {
		String str="Hello";
		char[] ch=str.toCharArray();
		String str1="";
		for(int i=0;i<ch.length;i++) {
			str1=ch[i]+str1;
		}
		System.out.println(str1);
	}

}
