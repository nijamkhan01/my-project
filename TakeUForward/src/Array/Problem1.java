package Array;

import java.util.Arrays;

public class Problem1 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,5,6,8,7,9};
		int largest=arr[0];
		int secondLargest=-1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondLargest=largest;
				System.out.println("Second largets"+secondLargest);
				largest=arr[i];
				System.out.println("Largest"+largest);
			}else if(arr[i]<largest && arr[i]>secondLargest) {
				secondLargest=arr[i];
				System.out.println(">>>."+secondLargest);
			}
		}
		System.out.println(secondLargest);
		
		//second largest and second smallest
//		int arr[]= {1,2,4,7,7,5,6,3};
//		int largest=arr[0];
//		for(int i=1;i<arr.length;i++) {
//			if(arr[i]>largest) {
//				largest=arr[i];
//			}
//		}
//		System.out.println(largest);
//		int secondLargest=-1;
//		for(int i=1;i<arr.length;i++) {
//			if(arr[i]>secondLargest&& arr[i]!=largest) {
//				secondLargest=arr[i];
//			}
//		}
		//System.out.println(secondLargest);
		//largest element
	/**	int arr[]= {3,2,1,5,2};
		int largest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		System.out.println(largest);
		Arrays.sort(arr);
		System.out.println(arr[4] );**/
	}

}
