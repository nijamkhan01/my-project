package SDET;

import java.util.*;

public class FirstNonRepeat {
	public static void main(String[] args) {
		String strInput="Automation Testing";
		HashMap<Character, Integer> map=new HashMap<>();
		
		for(int i=0;i<strInput.length();i++) {
			char ch=strInput.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println("This is first non repeat: "+entry.getKey());
				break;
			}
		}
	}

}
