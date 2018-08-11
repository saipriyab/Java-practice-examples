import java.util.Arrays;
import java.util.Scanner;

/**
 * @author saipriyadarshini
 *
 */
public class Sort {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("how many array elemenys you need to add");
	int n=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
		a[i]=s.nextInt();
	Arrays.sort(a);
	for(int j=0;j<n;j++)
		System.out.println(a[j]);
}
}
