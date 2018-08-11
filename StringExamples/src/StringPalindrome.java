import java.util.Scanner;

/**
 * @author saipriyadarshini
 *
 */
public class StringPalindrome {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("please enter the string");
	String g=s.next();
	String g1=new StringBuffer(g).reverse().toString();
	if(g.equals(g1))
		System.out.println("palindrome");
	else
		System.out.println("Not a palindrome");
}
}
