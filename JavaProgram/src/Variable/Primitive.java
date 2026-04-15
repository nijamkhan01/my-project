package Variable;

public class Primitive {
	public static void main(String[] args) {
		int a = 10; //4 byte
		long b=a;
		float c=a;
		double d=c;
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		float f=1.7f;
		int g=(int)f;
		System.out.println(g);
		
		byte byteValue=10; //1 byte -> 8 bit
		short shortValue=byteValue;//2 byte
		int intValue=byteValue; //4 byte
		long longValue=intValue;//8 byte //widening conversion from int to long
		float floatValue=longValue;// 4 byte //widening conversion from long to float
		double doubleValue=floatValue;//8 byte //widening conversion from float to double
		System.out.println("byte: "+byteValue);
		System.out.println("int: "+intValue);
		System.out.println("long: "+longValue);
		System.out.println("float: "+floatValue);
		System.out.println("double: "+doubleValue);
		
		char ch='A';
		int intValueChar=ch;
		float floatValueChar=ch;
		System.out.println(ch);
		System.out.println(intValueChar);
		System.out.println(floatValueChar);
		System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
		
		
	}

}
