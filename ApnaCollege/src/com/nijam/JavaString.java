package com.nijam;

public class JavaString {
	String name = new String("Nijam");
	String friend = new String("SOurav");

	public static void main(String[] args) {
		JavaString str = new JavaString();
		str.friend = "Riju";
		// length
		System.out.println(str.name.length());
		// concat
		String name3 = str.name + str.friend;
		// index
		System.out.println(name3.charAt(0));
		// replace
		System.out.println(str.friend.replace('R', 'D'));
		// substring
		System.out.println(str.name.substring(0, 1));
		// immutable return original string
		System.out.println(str.friend);

		String str1 = "Tumpa";
		String str2 = "Tumpa";
		String str3 = new String("Tumpa");
		String str4 = new String("Tumpa");
		if (str1 == str2) {
			System.out.println("True");
		}
		if (str3.equals(str4)) {
			System.out.println("True");
		}

	}

}
