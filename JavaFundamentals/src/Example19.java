
/**
 * @author saipriyadarshini
 *
 */
public class Example19 {
public static void main(String args[])
{
	if(args.length==0)
		System.out.println("Please enter an integer number");
else
{
	int k=Integer.parseInt(args[0]);
	int count=0;
	for(int i=2;i<=k;i++)
	{
		if(k%i==0)
			count++;
	}
	if(count==2)
	System.out.println(k+"is a Prime number");
	else if(k==0||k==1)
		System.out.println(k+"is neither composite nor prime");
	else
		System.out.println(k+"is not a  prime number ");
}

}
}
