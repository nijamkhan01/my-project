package Number;

public class swap {
	public static void main(String[] args) {
		int a=15, b=30;
		a=a+b-(b=a);
	System.out.println("a: "+a);
	System.out.println("b: "+b);
	
	a=a+b;//a=15+30=>45
	b=a-b;//b=45-30=>15
	a=a-b;//a=45-15=>30
	
	System.out.println("a: "+a);
	System.out.println("b: "+b);
	}
	
}
