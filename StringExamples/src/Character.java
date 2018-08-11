import java.util.Scanner;

/**
 * @author saipriyadarshini
 *
 */
public class Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String g=s.next();
		if(g.charAt(0)=='x'&&g.charAt(g.length()-1)=='x')
		{
			System.out.println(g.substring(1, g.length()-1));
		}
		else
			System.out.println(g);

	}

}
