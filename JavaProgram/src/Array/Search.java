package Array;

public class Search {
	public static void main(String[] args) {
		int[]arr= {1,5,6,8,9,4};
		int element=4;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				System.out.println("index: "+i);
				break;
			}
		}
	}

}
