package com.java_8.defaultMethod.Interface;

public class Interview {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5 ,7};
		int num = arr[0];
		for(int i : arr) {
			if(num != i) {
				System.out.println(num);
				
			}
			num++;
		}
	}

}
