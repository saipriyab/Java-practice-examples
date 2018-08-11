import java.util.Scanner;

/**
 * @author saipriyadarshini
 *
 */
public class Separator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String g=s.next();
		char p=s.next().charAt(0);
		int k=s.nextInt();
		for(int i=0;i<k;i++)
		{
			if(i!=k-1)
				System.out.print(g+p);
			else
				System.out.print(g);
		}

	}

}
