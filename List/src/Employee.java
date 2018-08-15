
public class Employee implements Comparable<Employee>{
int empid;
String Empname;
String EmpEmail;
char empgender;
float empsalary;

public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return Empname;
}
public void setEmpname(String empname) {
	Empname = empname;
}
public String getEmpEmail() {
	return EmpEmail;
}
public void setEmpEmail(String empEmail) {
	EmpEmail = empEmail;
}
public char getEmpgender() {
	return empgender;
}
public void setEmpgender(char empgender) {
	this.empgender = empgender;
}
public float getEmpsalary() {
	return empsalary;
}
public void setEmpsalary(float empsalary) {
	this.empsalary = empsalary;
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", Empname=" + Empname + ", EmpEmail=" + EmpEmail + ", empgender=" + empgender
			+ ", empsalary=" + empsalary + "]";
}
@Override
public int compareTo(Employee e) {
	// TODO Auto-generated method stub
	if(e.getEmpid()==this.empid)
		return 0;
	if(this.empid<e.getEmpid())
		return -1;
	return 1;
}

}
