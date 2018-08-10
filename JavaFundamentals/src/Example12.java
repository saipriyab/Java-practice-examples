import java.util.Scanner;

/**
 * @author saipriyadarshini
 *
 */
public class Example12 {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("please enter the character");
	char a=s.next().charAt(0);
	if(Character.isLowerCase(a))
	{
		System.out.println(Character.toUpperCase(a));
	}
	else
	{
		System.out.println(Character.toLowerCase(a));
	}
}
}
