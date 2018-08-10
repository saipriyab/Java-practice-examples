
/**
 * @author saipriyadarshini
 *
 */
public class Example11 {
public static void main(String args[])
{
	if(args[0].equalsIgnoreCase("Male"))
	{
		int k=Integer.parseInt(args[1]);
		if(k>=1&&k<=60)
			System.out.println("9.2%");
		if(k>=61&&k<=120)
			System.out.println("8.3%");
	}
	else
	{
		int k=Integer.parseInt(args[1]);
		if(k>=1&&k<=58)
			System.out.println("8.2%");
		if(k>=59&&k<=120)
			System.out.println("7.6%");
	}
}
}
