package SDET;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Duplicate {
	public static void main(String[] args) {
		String strInput="abcabc123123";
		HashMap<Character, Integer> hashMap=new HashMap<>();
		for(int i=0;i<strInput.length();i++) {
			char ch=strInput.charAt(i);
			hashMap.put(ch, hashMap.getOrDefault(ch,0)+ 1);
		}
		for(Map.Entry<Character, Integer> entry:hashMap.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println("["+entry.getKey()+","+entry.getValue()+"]");
			}
			
		}
		
	}

}
