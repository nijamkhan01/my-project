package SDET;

public class ReverseEachWord {
	public static void main(String[] args) {
		String strInput="Java is a Programming Language";
		String[] strWords=strInput.split(" ");
		String strReversedWord="";
		
		for(int i=0;i<strWords.length;i++) {
			String strWord=strWords[i];
			
			String strTemp="";
			char ch;
			for(int j=0;j<strWord.length();j++) {
				ch=strWord.charAt(j);
				strTemp=ch+strTemp;
			}
			strReversedWord=strReversedWord+strTemp+" ";
		}
		System.out.println(strReversedWord);
	}

}
