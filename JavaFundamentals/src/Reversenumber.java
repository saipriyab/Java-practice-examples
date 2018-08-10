import java.util.Scanner;

/**
 * @author saipriyadarshini
 *
 */
public class Reversenumber {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("please enter the number");
	int k=s.nextInt();
	String p=Integer.toString(k);
	System.out.println(new StringBuffer(p).reverse());
}
}
