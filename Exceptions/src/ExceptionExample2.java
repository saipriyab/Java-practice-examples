import java.util.Scanner;

public class ExceptionExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++)
	    	a[i]=s.nextInt();
	    System.out.println("enter index of array elementyou want to access");
	    int p=s.nextInt();
	    System.out.println("the array elementat index"+p+"="+a[p]+"\n"+"the array element successfully accessed");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getClass());
		}

	}

}
