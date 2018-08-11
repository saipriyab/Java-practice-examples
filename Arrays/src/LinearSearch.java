import java.util.Scanner;

/**
 * @author saipriyadarshini
 *
 */
public class LinearSearch {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("how many array elemenys you need to add");
	int n=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
		a[i]=s.nextInt();
	System.out.println("enter search element");
	int search=s.nextInt();
	int flag=0,k=0;
	for(int j=0;j<n;j++)
	{
		if(a[j]==search)
		{
			k=j;
			flag=1;
			break;
		}
	}
	if(flag==1)
		System.out.println(k+1);
	else
		System.out.println(-1);
}
}
