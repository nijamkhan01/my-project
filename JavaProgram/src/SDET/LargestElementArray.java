package SDET;

public class LargestElementArray {
public static void main(String[] args) {
	int arr[]= {1,7,5,9,4,8};
	int largest=arr[0];
	for(int num:arr) {
		if(num>largest) {
			largest=num;
		}
	}
	System.out.println("Largest: "+largest);
}
}
