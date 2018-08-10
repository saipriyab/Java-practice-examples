
/**
 * @author saipriyadarshini
 *
 */
public class Floyds {
public static void main(String args[])
{
	try {
		int k=Integer.parseInt(args[0]);
		for(int i=0;i<k;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	catch(Exception e)
	{
		System.out.println("please enter an  integer number");
	}
}
}
