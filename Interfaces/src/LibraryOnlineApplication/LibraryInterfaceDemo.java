package LibraryOnlineApplication;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryUser l;
		l=new kidUsers(10,"kids");
		System.out.println(l.requestBook());
		System.out.println(l.registeraccount());
		l=new AdultUser(15,"fiction");
		System.out.println(l.registeraccount());
		System.out.println(l.requestBook());

	}

}
