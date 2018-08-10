import java.util.Scanner;

/**
 * @author saipriyadarshini
 *
 */
public class Example17 {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int k=s.nextInt();
	int count=0;
	for(int i=1;i<=k;i++)
	{
		if(k%i==0)
			count++;
	}
	if(count==2)
		System.out.println("Prime number");
	else
		System.out.println("Not a prime number");
}
}
