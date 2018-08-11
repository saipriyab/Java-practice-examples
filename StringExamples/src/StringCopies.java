import java.util.Scanner;

/**
 * @author saipriyadarshini
 *
 */
public class StringCopies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner s=new Scanner(System.in);
            System.out.println("please enter the string");
            String  g=s.next();
            if(g.length()==2)
            	System.out.println(g+g);
            else
            {
            	String g1=g.substring(0,2);
            	for(int i=0;i<g.length();i++)
            		System.out.print(g1);
            }
	}

}
