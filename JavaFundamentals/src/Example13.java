import java.util.Scanner;

/**
 * @author saipriyadarshini
 *
 */
public class Example13 {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("please enter the character");
	char a=s.next().charAt(0);
	switch(a)
	{
	case 'R':System.out.println("Red");
	         break;
	case 'B':System.out.println("Blue");
             break;
	case 'G':System.out.println("Green");
    break;
	case 'O':System.out.println("Orange");
    break;
	case 'Y':System.out.println("Yellow");
    break;
    default:System.out.println("Invalid code");
    break;

	}
}
}
