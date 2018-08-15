
public class UserRegistration {
public void registerUser(String username,String usercountry)
	{
		 if(!usercountry.equals("India"))
		 {
			 try {
				throw new InvalidCountryException();
			} catch (InvalidCountryException e) {
				// TODO Auto-generated catch block
				System.out.println(e.toString());
			}
		 }
		 else
		 {
			 System.out.println("User registration done successfully");
		 }
	}

}
