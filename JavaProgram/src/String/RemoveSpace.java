package String;

import java.util.*;

public class RemoveSpace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your input: ");
		String strInput = sc.nextLine();
		System.out.println("Entered input: " + strInput);
		RemoveSpace obj = new RemoveSpace();
		obj.removeSpace(strInput);
	}
	public void removeSpace(String strInput) {
		String strSpaceRemoved=strInput.replaceAll("\\s+", "");
		System.out.println("After space removed: "+strSpaceRemoved);
	}

}
