import java.util.Scanner;

/**
 * @author saipriyadarshini
 *
 */
public class Sumofdigits {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int k=s.nextInt();
	int sum=0;
	while(k!=0)
	{
		int r=k%10;
		sum=sum+r;
		k=k/10;
	}
	System.out.println(sum);
}
}
