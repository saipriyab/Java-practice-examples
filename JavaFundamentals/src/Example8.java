
/**
 * @author saipriyadarshini
 *
 */
public class Example8 {
public static void main(String args[])
{
	for(int i=0;i<args.length;i++)
	{
		if(i!=args.length-1)
		{
			System.out.print(args[i]+",");
		}
		else
			System.out.print(args[i]);
	}
}
}
