
public class PasswordService 
{
	public PasswordService() 
	{
		
	}
	
	public boolean VerifyPassword(String password)
	{
		// Return true if all of the following is true
		
		// - password is 8 character or longer
		if (password.length() < 8)	
			return false;

		// - password contain a special character [!@#$%^&*]
		if (!HasASpecialCharacter(password))
			return false;

		// - password must contain an uppercase character
		if (!hasUpperCase(password))
			return false;

		// - password must contain at least one number
		if (!hasOneDigit(password))
			return false;
		
		// - password must not be a palindrome *
		if (isAPalindrome(password))
			return false;
		
		if (isAllDigits(password))
		return false;
			
		return true;
		
	}

	 private boolean hasOneDigit(String password)
	{
		for (int i = 0; i < password.length(); i++)
			if (Character.isDigit(password.charAt(i)))
				return true;
		
		return false;
	}
	
	 private boolean isAPalindrome(String password)
	 {
		 int i2 = password.length() - 1;
		 for (int i = 0; i < (password.length()) / 2; i++, i2--)
		 {
			 if (password.charAt(i) != password.charAt(i2))
				return false;
		 }
		 
		return true;
		 
	 }
	 
	 private boolean isAllDigits(String password)
	{
		for (int i = 0; i < password.length(); i++)
		{
			
			if (!Character.isDigit(password.charAt(i)))
			{           
				return false;
			}
		}
		
		return true;	
	}
	 
	 private boolean HasASpecialCharacter(String password)
	 {
		 String special = "!@#$%^&*";
		 for(int i = 0;i < special.length(); i++)
		 {
			if (password.contains(Character.toString(special.charAt(i))))
			{
				return true;
			}
			
		 }
		 return false;
	 } 
	 
	 private boolean hasUpperCase(String password)
	{
		for (int i = 0; i < password.length(); i++)
			if (Character.isUpperCase(password.charAt(i)))
				return true;
		
		return false;	
	}
}
