package String;

import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practice {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your Input.");
	String strInput=new String();
	strInput=sc.nextLine();
	System.out.println("Here is your value: "+strInput);
	
	HashMap<Character, Integer> map=new HashMap<>();
	List<Character> list=new ArrayList<>();
	
	strInput=strInput.toLowerCase();  
    char [] array=strInput.toCharArray();	
	for(int i=0;i<array.length-1;i++) {
		int count=1;
		
		for(int j=i+1;j<array.length;j++) {
			if(array[i]==array[j]) {
			count++;
			//array[j]='*';
			}
		}
		if(!list.contains(array[i])) {
		map.put(array[i], count);
		}
		list.add(array[i]);
	}
	for(Map.Entry<Character, Integer> entry:map.entrySet()) {
		System.out.println("Key: "+entry.getKey()+", Value: "+entry.getValue());
		if(entry.getValue()>1) {
			System.out.println("Key: "+entry.getKey()+"Value: "+entry.getValue());
		}
	}
}
}
