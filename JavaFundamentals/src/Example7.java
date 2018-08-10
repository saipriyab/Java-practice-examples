import java.util.Scanner;

/**
 * @author saipriyadarshini
 *
 */
public class Example7 {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int n=s.nextInt();
	if(n>0)
		System.out.println("positive number");
	else if(n<0)
		System.out.println("Negative number");
	else
		System.out.println("zero");
}
}
