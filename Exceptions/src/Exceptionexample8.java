
public class Exceptionexample8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              int a=Integer.parseInt(args[0]);
              if(a>=18&&a<60)
              {
            	  
              }
              else
            	  try
              {
            	  throw new AgeException();
              }
              catch(AgeException e1)
              {
            	  System.out.println(e1.toString());
              }
	}

}
