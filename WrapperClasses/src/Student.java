
public class Student implements Cloneable{
int age;
String name;
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Object clone() throws CloneNotSupportedException
{
	return super.clone();
}
public static void main(String args[]) throws CloneNotSupportedException
{
	Student s=new Student();
	s.setAge(10);
	s.setName("xyz");
	Student s1=(Student) s.clone();
	System.out.println(s1.getAge()+" "+s1.getName());
	s1.setAge(20);
	s1.setName("abc");
	System.out.println(s1.getAge()+" "+s1.getName());
}
}
