package SDET;

public class CheckArrayContainsDuplicate {
	public static boolean containsDuplicate(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Contains Duplicate");
					return true;
				}
			}
		}
		System.out.println("not Contains Duplicate");
		return false;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		System.out.println(containsDuplicate(arr));
	}

}
