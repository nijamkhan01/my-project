package String;

public class HeapandPull {
	public static void main(String[] args) {
		String strName="Nijam";
		String strNewName=new String("Nijam").intern();
		System.out.println(strName==strNewName);
//		System.out.println(strName.equals(strName1));
//		System.out.println(strNewName==strNewName1);
//		System.out.println(strAddress.equals(strNewAddress));
	}

}
