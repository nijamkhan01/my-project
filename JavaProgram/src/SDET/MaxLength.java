package SDET;

import java.util.HashSet;

public class MaxLength {
	public static void main(String[] args) {
		String s1 = "abcabcbb";
		String s2 = "bbbbbb";
		String s3 = "pwkwcw";
		String s4 = " ";
		System.out.println("Longest for S1: " + longestLength(s1));
		System.out.println("Longest for s2: " + longestLength(s2));
		System.out.println("Longest for s3: " + longestLength(s3));
		System.out.println("Longest for s4: " + longestLength(s3));
	}

	public static int longestLength(String strInput) {
		HashSet<Character> hashSet = new HashSet<>();
		int intMaxLength = 0, intStart = 0, intEnd = 0;
		while (intEnd < strInput.length()) {
			char ch = strInput.charAt(intEnd);
			if (!hashSet.contains(ch)) {
				hashSet.add(ch);
				intMaxLength = Math.max(intMaxLength, intEnd - intStart + 1);
				intEnd++;
			} else {
				hashSet.remove(strInput.charAt(intStart));
				intStart++;
			}
		}
		return intMaxLength;
	}

}
