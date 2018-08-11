import java.util.Scanner;

/**
 * @author saipriyadarshini
 *
 */
public class StringAppend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       System.out.println("Please enter string1");
       String g=s.next();
       System.out.println("Please enter string2");
       String g1=s.next();
       if(g.charAt(g.length()-1)==g1.charAt(0))
       {
    	   String g2=g1.substring(1);
    	   System.out.println((g+g2).toLowerCase());
       }
       else
       {
    	   System.out.println((g+g1).toLowerCase());
       }
	}

}
