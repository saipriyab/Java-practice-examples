import java.util.Random;

/**
 * @author saipriyadarshini
 *
 */
public class TestCompartment {
public static void main(String args[])
{
	Compartment c[]=new Compartment[4];
	Random r=new Random();
	for(int i=0;i<4;i++)
	{
	int x=r.nextInt(5);
	if(x==0)
	{
	c[i]=(Compartment) new FirstClass();
	System.out.println(c[i].notice());
	}
	if(x==1)
	{
	c[i]=(Compartment) new Ladies();
	System.out.println(c[i].notice());
	}
	if(x==2)
	{
	c[i]=(Compartment) new General();
	System.out.println(c[i].notice());
	}
	if(x==3)
	{
	c[i]=(Compartment) new Luggage();
	System.out.println(c[i].notice());
	}
	}
}
}
