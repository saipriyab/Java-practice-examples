
/**
 * @author saipriyadarshini
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICICIBank i=new ICICIBank();
		KotMBank k=new KotMBank();
		System.out.println(i.getFixedInterestRate());
		System.out.println(i.getSavingInterestRate());
		System.out.println(k.getFixedInterestRate());
		System.out.println(k.getSavingInterestRate());
		GeneralBank b;
		b=new ICICIBank();
		System.out.println(b.getFixedInterestRate());
		System.out.println(b.getSavingInterestRate());
		b=new KotMBank();
		System.out.println(b.getFixedInterestRate());
		System.out.println(b.getSavingInterestRate());

	}

}
