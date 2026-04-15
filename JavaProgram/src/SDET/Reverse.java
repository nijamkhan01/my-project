package SDET;
import java.util.*;
public class Reverse {
	public static String reverse() {
		String strInput = "Practice";
		String strReversed = "";
	/**	for (int i = 0; i < strInput.length(); i++) {
			strReversed = strInput.charAt(i) + strReversed;
		}
		if (strReversed.equals(strInput)) {
			System.out.println("This is a palindrome."+strReversed);
		} else {
			System.out.println("This is not palindrome."+strReversed);
		}
		return strReversed;
	}**/
		
		StringBuilder sb= new StringBuilder();
		sb.append(strInput);
		sb.reverse();
		System.out.println(sb);
		
		return strInput;
	}
		
	public static void main(String[] args) {
		reverse();
		Scanner sc= new Scanner(System.in);
	    String strInput=sc.nextLine();
	    String strReveString="";
	        for(int i=0;i<strInput.length();i++){
	            strReveString=strInput.charAt(i)+strReveString;
	        }
	        if(strReveString.equals(strInput)){
	            System.out.println("Yes");
	        } 
	}

}
