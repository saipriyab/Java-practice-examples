
/**
 * @author saipriyadarshini
 *
 */
public class OneDimensional {

	public static void main(String[] args) {
		int a[]= {10,3,4,7,8,9,6,5};
		int j=0,p=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==6)
				j=i;
			if(a[i]==7)
				p=i;
		}
		int sum=0;
		if(p>j)
		{
		sum=0;
			for(int i=0;i<j;i++)
				sum=sum+a[i];
			for(int k=p+1;k<a.length;k++)
				sum=sum+a[k];
		}
		else
		{
			for(int k=0;k<a.length;k++)
				sum=sum+a[k];
		}
		System.out.println(sum);

	}

}
