import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author saipriyadarshini
 *
 */
public class EmployeeDB {
	static ArrayList<Employee> a1=new ArrayList<Employee>();
	boolean addEmployee(Employee e)
{
	a1.add(e);
	return true;
}
	boolean deleteEmployee(int empid)
	{
		int i=0;
		Iterator i2=a1.iterator();
		while(i2.hasNext())
		{
			
			Employee e2=(Employee)i2.next();
			if(e2.getEmpid()==empid)
			{
				/*System.out.println("enteres");
				a1.remove(e2);*/
				i2.remove();
			}
			
		}
		return true;
	}
	String showPaySlip(int empid)
	{
		String g3="";
		Iterator i2=a1.iterator();
		while(i2.hasNext())
		{
			Employee e2=(Employee)i2.next();
			if(e2.getEmpid()==empid)
			{
				g3=e2.toString();
			}
		}
		return g3;
	}
	
	Employee[] listall()
	{
		Employee[] e=new Employee[a1.size()];
		TreeSet<Employee> t=new TreeSet<Employee>();
		Iterator i2=a1.iterator();
		while(i2.hasNext())
		{
			Employee e2=(Employee)i2.next();
			t.add(e2);
		}
		int p=0;
		for(Employee e3:t)
		{
		e[p]=e3;
		p++;
		}
		return e;
	}
}
