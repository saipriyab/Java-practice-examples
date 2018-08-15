import java.util.Scanner;

public class ExceptionExample5 {
public static void main(String args[])throws ArithmeticException
{
	System.out.println("enter 2 numbers");
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	int k=a/b;
	System.out.println(k);
}
}
