
/**
 * @author saipriyadarshini
 *
 */
public class Divisibility {
public static void main(String args[])
{
	int count=0;
	for(int i=1;count!=5;i++)
	{
		if(i%2==0&&i%3==0&&i%5==0)
		{
			count++;
			System.out.println(i);
		}
	}
}
}
