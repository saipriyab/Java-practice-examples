package LibraryOnlineApplication;

public class AdultUser implements LibraryUser{
int age;
String bookType;

public AdultUser(int age, String bookType) {
	super();
	this.age = age;
	this.bookType = bookType;
}
@Override
public String registeraccount() {
	// TODO Auto-generated method stub
	String g1="";
	if(age>12)
	{
		g1="adult account";
	}
	if(age<12)
	{
		g1="sorry,age must be gretaer than 12 to register as a adult";
	}
	return g1;
}
@Override
public String requestBook() {
	// TODO Auto-generated method stub
	String g2="";
	if(bookType.equalsIgnoreCase("fiction"))
	{
		g2="book issued successfully please return the book within 7 days";
	}
	else
		g2="oops!you are allowed to take only adult fiction books";
	return g2;
}

}
