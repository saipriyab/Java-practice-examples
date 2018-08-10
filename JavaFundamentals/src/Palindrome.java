
/**
 * @author saipriyadarshini
 *
 */
public class Palindrome {
public static void main(String args[])
{
	String p=args[0];
	String p1=new StringBuffer(p).reverse().toString();
	if(p.equals(p1))
		System.out.println(p+"is a palindrome");
	else
		System.out.println(p+"is not a palindrome");
}
}
