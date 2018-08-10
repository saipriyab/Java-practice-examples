import java.util.Scanner;

/**
 * @author saipriyadarshini
 *
 */
public class Example10 {
public static void main(String args[])
{
	System.out.println("enter");
	Scanner s=new Scanner(System.in);
	String g=s.next();
	if(Character.isDigit(g.charAt(0)))
		System.out.println("digit");
	else if(Character.isLetter(g.charAt(0)))
		System.out.println("alphabet");
	else
		System.out.println("special character");
}
}
