import java.util.Scanner;

/**
 * @author saipriyadarshini
 *
 */
public class Calculator {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	
	char ch='0';
	do
	{
	System.out.println("Enter two numbers");
	int a=s.nextInt();
	int b=s.nextInt();
	System.out.println("please choose 1.add 2.sub");
	int k=s.nextInt();
	switch(k)
	{
	case 1:System.out.println(a+b);
	       break;
	case 2:System.out.println(a-b);
    break;
	}
	System.out.println("do u wish to continue(y||Y)");
	ch=s.next().charAt(0);
	}while(ch=='y'||ch=='Y');
}
}
