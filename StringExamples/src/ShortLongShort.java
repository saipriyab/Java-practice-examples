import java.util.Scanner;

/**
 * @author saipriyadarshini
 *
 */
public class ShortLongShort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String g=s.next();
		String  g1=s.next();
		if(g.length()==0&&g1.length()==0)
		{
			System.out.println("both strings are empty");
		}
		else
		{
			if(g.length()<g1.length())
			{
				System.out.println(g+g1+g);
			}
			if(g1.length()<g.length())
			{
				System.out.println(g1+g+g1);
			}
		}

	}

}
