import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;

public class powers1
{

	public static void main(String[] args)
	{
	
	int base = getIntInput ("enter base : ");
	int exponent = getIntInput ("enter exponent : ");
	long total = base;
	
	for (int i = 1; i < exponent; i++)
	{
		total = base * total;
		// added =  base * total;
		//total = total * added;
	}
	
	System.out.println(NumberFormat.getNumberInstance().format(total));
	System.out.println("Largest INT Value Possible is: " + Integer.MAX_VALUE);
	//calling();
// functions call would go here
	}
	public static void calling ()
	{
		System.out.print("Hello world");	
	}
	
	public static int getIntInput(String consolePrompt)
	{
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		try {
			System.out.print(consolePrompt);
			return Integer.parseInt(in.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return 0;
	}
}
