import java.util.Scanner;

public class Exceptionexample1 {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	try
	{
		int n=s.nextInt();
		System.out.println(n*n);
	}
	catch(Exception e)
	{
		System.out.println("Entered input is not a valid format for integer");
	}
}
}
