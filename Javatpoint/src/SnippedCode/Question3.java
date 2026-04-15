package SnippedCode;

public class Question3 {
public static void main(String[] args) {
	try 
    {
        int i, sum;
        sum = 10;
        for (i = -1; i < 3 ;++i) {
            sum = (sum / i);
        System.out.println(sum);
        }
    }
    catch(ArithmeticException e) 
    {
	System.out.print("0");        	
    } 
}
}
