import java.util.Scanner;

/**
 * @author saipriyadarshini
 *
 */
public class Exceptionexample9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("enter 2 numbers");
			Scanner s=new Scanner(System.in);
			int a=s.nextInt();
			int b=s.nextInt();
			System.out.println("The quotient of"+a+"/"+b+"is"+a/b);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero exception caught");
		}
		finally
		{
			System.out.println("finally is executed");
		}

	}

}
