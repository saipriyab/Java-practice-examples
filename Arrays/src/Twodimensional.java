import java.util.Arrays;

/**
 * @author saipriyadarshini
 *
 */
public class Twodimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==9)
		{
          int a[][]=new int[3][3];
          int p=0;
          for(int i=0;i<3;i++)
          {
        	  for(int j=0;j<3;j++)
        	  {
        		  a[i][j]=Integer.parseInt(args[p]);
        		  p++;
        	  }
          }
          for(int i=0;i<3;i++)
          {
        	  for(int j=0;j<3;j++)
        	  {
        		  System.out.print(a[i][j]+" ");  		 
        	  }
        	  System.out.println();
          }
          
		}
		
		else
			System.out.println("please enter 9 integer numbers");
	}

}
