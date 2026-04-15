package String;

import java.util.HashMap;
import java.util.Map;

public class DulicateCharracter {
	public static void main(String[] args) {
		String strInput="aab bcc 123 ";
		HashMap<Character, Integer> mapDuplicate=new HashMap<Character,Integer>();
		for(int i=0;i<strInput.length();i++) {
			char ch=strInput.charAt(i);
			mapDuplicate.put(ch, mapDuplicate.getOrDefault(ch, 0)+1);
		}
		for(Map.Entry<Character,Integer> entry:mapDuplicate.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println("['"+entry.getKey()+"', "+entry.getValue()+"]");
			}
		}
	}

}
