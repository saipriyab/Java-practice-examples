
/**
 * @author saipriyadarshini
 *
 */
public class TwoDimensionalExample1 {
public static void main(String args[])
{
	if(args.length==4)
	{
	int a[][]=new int[2][2];
	int p=0;
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			a[i][j]=Integer.parseInt(args[p]);
			p++;
		}
	}
	System.out.println("The reverse of the array is");
	for(int j1=1;j1>=0;j1--)
	{
		for(int k1=1;k1>=0;k1--)
		{
			System.out.print(a[j1][k1]+" ");
		}
		System.out.println();
	}
	}
	else
		System.out.println("Please enter 4 digits");
}
}
