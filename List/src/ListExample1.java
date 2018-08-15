import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ListExample1 {
	 static ArrayList a2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        a2=saveEvenNumbers(n);
        printEvenNumbers(a2);
        int n1=s.nextInt();
        printEvenNumber(n1);
	}

	private static void printEvenNumber(int n) {
		// TODO Auto-generated method stub
		System.out.println(a2.contains(n));
		
	}

	private static void printEvenNumbers(ArrayList a2) {
		// TODO Auto-generated method stub
		Iterator i2=a2.iterator();
		while(i2.hasNext())
		{
			int l=(int)i2.next();
			if(l%2==0)
				System.out.println(l);
		}
		
	}

	private static ArrayList saveEvenNumbers(int n) {
		// TODO Auto-generated method stub
		ArrayList a2=new ArrayList();
		for(int i=0;i<n;i++)
		{
			System.out.print(i*2+" ");
			a2.add(i*2);
		}
		return a2;
		
		
	}

}
