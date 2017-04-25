import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class print 
{

	public static void main(String[] args)
	{
	   
	   String s = getStringInput("enter name : ");
	   char[] letters =s.toCharArray() ;
	   int ending = letters.length;
		for (int i = 0; i < ending; i++)
		{
			System.out.print(letters[i]);				
		}
	System.out.println(" ");	
		for (int i = ending - 1; i > - 1 ;i--)
		{
			System.out.print(letters[i]);
		}
		
		
	}
	public static String getStringInput(String consolePrompt)
	{
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
	    try {
			System.out.print(consolePrompt);
			return in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	    
	    return "";
	}
}
