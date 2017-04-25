package MathPrograms;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Adding1
{

	public static void main(String[] args)
	{
		int NumberOfNumbers = getIntInput("Enter number of numbers : ");
		int total = 0;
		int[] numbers = new int[NumberOfNumbers];
		int lastIndex = NumberOfNumbers - 1;
		
		 if (NumberOfNumbers > 0)
		 {
			 
			 for (int idx = 0; idx < NumberOfNumbers; idx++)
			 {
				 if (idx == 0)
				 {
					 numbers[idx] = getIntInput("enter your first number : ");
				 }
				 else if (idx == lastIndex)
				 {
					 numbers[idx] = getIntInput("enter your last number : ");
				 }
				 else
				 {
					 System.out.print("geting number " + (idx + 1) + " of " + NumberOfNumbers);
					 numbers[idx] = getIntInput(" Enter number : ");
				 }
				 
				 total = total + numbers[idx];
			 }
			 
			 
			 numbers[0] = getIntInput("enter your first number : ");
			 
			 total = total + numbers[0];
			 for (int i = 1; i <  (NumberOfNumbers - 1); i++ )
			 {
				 System.out.print("geting number " + (i + 1) + " of " + NumberOfNumbers);
				 numbers[i] = getIntInput(" Enter number : ");
				 total = total + numbers[i];
			 }
			
			 numbers[NumberOfNumbers - 1] = getIntInput("enter your last number : ");
			
			 total = total + numbers[NumberOfNumbers - 1];
		 }
		 
		 System.out.println("printing numbers");
		for (int i = 0; i < NumberOfNumbers; i++)
		{
		 System.out.println(numbers[i]);
		}
		 System.out.println("the sum of your " + NumberOfNumbers + " numbers is " + total);
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
