package SDET;

public class Snippet {
	public static void main(String[] args) {
		System.out.println(5 + 3 + 'A' + "Interview" + 'A' + "Mindfire" + (10 - 4) + (5 * 2) + 6 + 6);
		
		int arr[] = { 1, 2, 3, 5, 6, 7 };//
		int n = arr.length;
		int expectedSum = (n * (n + 1)) / 2;
		System.out.println(expectedSum);
		int actualSum = 0;
		for (int num : arr) {
			actualSum += num;
		}
		System.out.println(actualSum);
		int missingNum = expectedSum - actualSum;
		System.out.println("missing number is: " + missingNum);
	}
}
