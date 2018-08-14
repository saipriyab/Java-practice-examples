
/**
 * @author saipriyadarshini
 *
 */
public class InstrumentMain {
public static void main(String args[])
{
	Instrument i[]=new Instrument[10];
	i[0]=new Guitar();
	i[1]=new Piano();
	i[2]=new Flute();
	i[0].play();
	i[1].play();
	i[2].play();
	System.out.println(i[0] instanceof Guitar);
	System.out.println(i[1] instanceof Piano);
	System.out.println(i[2] instanceof Flute);
}
}
