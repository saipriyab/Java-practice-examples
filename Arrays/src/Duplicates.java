import java.util.Arrays;

/**
 * @author saipriyadarshini
 *
 */
public class Duplicates {
public static void main(String args[])
{
	int a[]= {12,22,13,12,22};
	Arrays.sort(a);
	int p=a.length;
	int j=0;
	String p2="";
	a[j]=a[0];
	for(int i=0;i<p-1;i++)
	{
		if(a[j]!=a[i])
		{
			j++;
			a[j]=a[i];
		}
		
	}
	for(int i=0;i<=j;i++)
	{
		System.out.println(a[i]);
	}
}
}
