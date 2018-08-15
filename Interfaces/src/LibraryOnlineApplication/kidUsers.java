package LibraryOnlineApplication;

public class kidUsers implements LibraryUser{
int age;
String bookType;

public kidUsers(int age, String bookType) {
	super();
	this.age = age;
	this.bookType = bookType;
}
@Override
public String registeraccount() {
	// TODO Auto-generated method stub
	String g1="";
	if(age<12)
	{
		g1="kids account";
	}
	if(age>12)
	{
		g1="sorry,age must be less than 12 to register as a kid";
	}
	return g1;
}
@Override
public String requestBook() {
	// TODO Auto-generated method stub
	String g2="";
	if(bookType.equalsIgnoreCase("kids"))
	{
		g2="book issued successfully please return the book within 10 days";
	}
	else
		g2="oops!you are allowed to take only kids books";
	return g2;
}
}
