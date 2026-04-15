package String;

public class Palindrome {
	public static void main(String[] args) {
		String strInput="1245";
		String strTemp="";
//		for(int i=strInput.length()-1;i>=0;i--) {
//			strTemp+=strInput.charAt(i);
//		}
		for(int i=0;i<strInput.length();i++){
		strTemp=strInput.charAt(i)+strTemp;
		}
		if(strInput.equals(strTemp)) {
			System.out.println("This is palindrome.");
		}else {
			System.out.println("This is not palindrome.");
		}
	}

}
