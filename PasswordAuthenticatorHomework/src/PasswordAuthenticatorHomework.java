
public class PasswordAuthenticatorHomework 
{

	public static void main(String[] args) 
	{
		PasswordService S = new PasswordService();
		
		if (S.VerifyPassword("g"))
			System.out.println("Access Granted!!!");
		else
			System.out.println("You Have Been Denied!!!");
	}	
}
 
