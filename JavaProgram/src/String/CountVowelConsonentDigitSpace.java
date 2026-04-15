package String;

import java.util.Scanner;

public class CountVowelConsonentDigitSpace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your input: ");
		String strInput = sc.nextLine();
		System.out.println("Entered input: " + strInput);
		CountVowelConsonentDigitSpace obj= new CountVowelConsonentDigitSpace();
		obj.countPresent(strInput);
	}

	public void countPresent(String strInput) {
		int vowels = 0, consonent = 0, digit = 0, specialChar = 0;
		for (int i = 0; i < strInput.length(); i++) {
			char ch = strInput.charAt(i);
			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				ch = Character.toLowerCase(ch);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels++;
				} else {
					consonent++;
				}
			} else if (ch >= '0' && ch <= '9') {
				digit++;
			} else {
				specialChar++;
			}
		}
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonent: " + consonent);
		System.out.println("Digit: " + digit);
		System.out.println("Special Charracter: " + specialChar);
	}

}
