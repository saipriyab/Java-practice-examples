
public class MathOperation {
public static void main(String args[])

{
	try
	{
	int a[]=new int[args.length];
	int sum=0,avg=0;
	for(int i=0;i<args.length;i++)
	{
		a[i]=Integer.parseInt(args[i]);
		sum=sum+a[i];
	}
	System.out.println("sum is"+sum);
	System.out.println("avg is"+sum/args.length);
	}
	catch(NumberFormatException e)
	{
		System.out.println(e);
	}
	catch(ArithmeticException e1)
	{
		System.out.println(e1);
	}
}
}
