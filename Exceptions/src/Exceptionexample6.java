import java.util.Scanner;

public class Exceptionexample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			System.out.println("enter name");
			String g=s.next();
			int a[]=new int[2];
			for(int j=0;j<2;j++)
			{
				a[j]=s.nextInt();
				if(a[j]<0)
				{
					try {
						throw new NegativeException();
					} catch (NegativeException e) {
						// TODO Auto-generated catch block
						System.out.println(e);
					}
				}
				if(a[j]>0&&a[j]<=100)
				{
					
				}
				else
				{
					try {
						throw new RangeException();
					} catch (RangeException e) {
						// TODO Auto-generated catch block
						System.out.println(e);
					}
				}
			}
		}

	}

}
