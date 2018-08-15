
/**
 * @author saipriyadarshini
 *
 */
public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]);
		System.out.print("Given Number"+a);
		System.out.println("Binary Equivalent"+Integer.toBinaryString(a));
		System.out.println("Hexa equivalent "+Integer.toHexString(a));
		System.out.println("Octal Equivalent"+Integer.toOctalString(a));

	}

}
