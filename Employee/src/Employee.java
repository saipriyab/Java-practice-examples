
public class Employee {
public static void main(String args[])
{
	int empno[]= {1001,1002,1003,1004,1005,1006,1007};
	String empname[]= {"Asish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
	String joindate[]= {"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","1/1/2000","12/06/2006"};
	char d[]= {'e','c','k','r','m','e','c'};
	String department[]= {"R&D","PM","Acct","Front Desk","Engg","Manfacturing","PM"};
	int basic[]= {20000,30000,10000,12000,50000,23000,29000};
	int hra[]= {8000,12000,8000,6000,20000,9000,12000};
	int it[]= {3000,9000,1000,2000,4400,10000};
	int a=Integer.parseInt(args[0]);
	int p=0;
	String d1="";
	int da=0,f=0;
	for(int i=0;i<empno.length;i++)
	{
		if(empno[i]==a)
		{
			p=i;
			if(d[p]=='e')
			       {
				   d1="Engineer";
				    da=20000;
				    f=1;
			       }
			      
			if(d[p]=='c')
		       {
			   d1="Consultant";
			    da=32000;
			    f=1;
		       }
			if(d[p]=='k')
		       {
			   d1="Clerk";
			    da=12000;
			    f=1;
		       } 
			if(d[p]=='r')
		       {
			   d1="Receptonist";
			    da=15000;
			    f=1;
		       } 
			if(d[p]=='m')
			{
				d1="Manager";
			    da=40000;
			    f=1;
			}
			break;
		}
	}
	if(f==1)
	{
	System.out.println("EmpNo"+" "+"EmpName"+" "+"Department"+" "+"Designation"+" "+"Salary");
	System.out.print(empno[p]+" "+empname[p]+" "+department[p]+" "+d1+" ");
	System.out.print(basic[p]+hra[p]+da-it[p]);
	}
	else
	System.out.println("There is no employee with empid:"+a);
}
}
