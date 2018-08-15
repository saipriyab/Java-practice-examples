
public class Main {
public static void main(String args[])
{
	EmployeeDB e=new EmployeeDB();
	Employee e1=new Employee();
	e1.setEmpEmail("xyz");
	e1.setEmpgender('f');
	e1.setEmpid(121);
	e1.setEmpname("abc");
	e1.setEmpsalary(12f);
	Employee e2=new Employee();
	e2.setEmpEmail("xyz1");
	e2.setEmpgender('f');
	e2.setEmpid(122);
	e2.setEmpname("abc1");
	e2.setEmpsalary(12f);
	Employee e3=new Employee();
	e3.setEmpEmail("xyz2");
	e3.setEmpgender('f');
	e3.setEmpid(123);
	e3.setEmpname("abc3");
	e3.setEmpsalary(12f);
	e.addEmployee(e1);
	e.addEmployee(e2);
	e.addEmployee(e3);
	e.showPaySlip(121);
	System.out.println(e.listall().length);
	e.deleteEmployee(121);
	System.out.println(e.listall().length);
	
}
}
