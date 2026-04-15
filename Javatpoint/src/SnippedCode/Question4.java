package SnippedCode;

public class Question4 {
	public static void main(String[] args) {
		String a=new String("Java");
		String b=new String("Java");
		
		String c="Java";
		String d="Java";
		
		System.out.println(a==b);//false
		System.out.println(c==d);//true
		System.out.println(a.equals(b));//true
		System.out.println(c.equals(d));//true
		
		String e=new String("Java").intern();
		String f=new String("Java").intern();
		
		System.out.println(e==f);//true
		System.out.println(e.equals(f));//true
		
	}

}
