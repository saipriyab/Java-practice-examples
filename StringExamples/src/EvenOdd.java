import java.util.Scanner;

import java.util.Scanner;

/**
 * @author saipriyadarshini
 *
 */
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String g=s.next();
		int k=g.length();
		if(k%2!=0)
		{
			System.out.println("null");
					
		}
		else
			System.out.println(g.substring(0, g.length()/2));
	}

}
