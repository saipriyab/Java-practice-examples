import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> a1=new ArrayList<Employee>();
          Scanner s=new Scanner(System.in);
          System.out.println("Enter the number of employees");
          int n=s.nextInt();
          for(int i=0;i<n;i++)
          {
        	  System.out.println("Enter Employee"+i+"details");
        	  System.out.print("Enter the first name");
        	  String first=s.next();
        	  System.out.println("Enter the lastname");
        	  String last=s.next();
        	  System.out.println("Enter the Mobile");
        	  String mobile=s.next();
        	  System.out.println("Enter the email");
        	  String email=s.next();
        	  System.out.println("Enter the address");
        	  String address=s.next();
        	  Employee e=new Employee();
        	  e.setFirstname(first);
        	  e.setLastname(last);
        	  e.setMobilenumber(mobile);
        	  e.setAddress(address);
        	  e.setEmailid(email);
        	  a1.add(e);
        	  Collections.sort(a1,new NameComparator());
          }
          a1.forEach(System.out::println);
	}

}
