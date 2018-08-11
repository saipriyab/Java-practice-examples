
/**
 * @author saipriyadarshini
 *
 */
public class MaxOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,20,20,10};
		int max=0,j=0,count=0,count1=0;
		for(int i=0;i<a.length;i++)
		{
			j=a[i];
			count=0;
			for(int k=0;k<a.length;k++)
				{
				if(a[k]==j)
				{
					count++;
				}
			}
			if(count>count1)
			{
				count1=count;
				max=j;
			}
		}
		System.out.println(max);

	}

}
