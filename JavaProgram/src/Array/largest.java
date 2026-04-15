package Array;

public class largest {
	public static void main(String[] args) {
		int[]arr= {120,567,10,40,750,300};
		int largest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		System.out.println(largest);
	}

}
