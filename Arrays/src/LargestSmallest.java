import java.util.Arrays;
import java.util.Scanner;

/**
 * @author saipriyadarshini
 *
 */
public class LargestSmallest {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("how many array elemenys you need to add");
	int n=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
		a[i]=s.nextInt();
	Arrays.sort(a);
	System.out.println("smallest 2 numbers"+a[0]+" "+a[1]);
	System.out.println("largest 2 numbers"+a[n-1]+" "+a[n-2]);
}
}
