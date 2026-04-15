package SDET;

import java.util.*;

public class Anagram {
	public static boolean anagram(String str1,String str2) {
		if(str1.length() !=str2.length()) {
		return false;
		}
		char[] str1Array=str1.toCharArray();
		char[] str2Array=str2.toCharArray();
		Arrays.sort(str1Array);
		Arrays.sort(str2Array);
		return Arrays.equals(str1Array, str2Array);
	}
	public static void main(String[] args) {
		String strInput1="geeks";
		String strInput2="kseeg";
		if(anagram(strInput1, strInput2)==true) {
			System.out.println("This is an anagram.");
		}else {
			System.out.println("This is not an anagram.");
		}
	}
}
