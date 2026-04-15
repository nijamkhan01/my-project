package SDET;

public class CountVowel {
	public static void count() {
		String strInput="aeiABCabc123@#$";
		int Vowels=0,Consonent=0,Digit=0,Special=0;
		for(int i=0;i<strInput.length();i++) {
			char ch=strInput.charAt(i);
			if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')) {
				ch=Character.toLowerCase(ch);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					Vowels++;
				}else {
					Consonent++;
				}
			}else if(ch>='0'&&ch<='9') {
				Digit++;
			}else {
				Special++;
			}
		}
		System.out.println("Vowels: "+Vowels);
		System.out.println("Consonent: "+Consonent);
		System.out.println("Digit: "+Digit);
		System.out.println("Special: "+Special);
	}
	public static void main(String[] args) {
		count();
	}

}
