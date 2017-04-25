import java.util.Random;
public class DiceCount2 
{

	public static void main(String[] args) 
	{
		boolean allRollsAreNotTheSame = true;
		int numberofdice = 3;
		int[] numbers = RollTheDice();
		int uniqueRollValue = numbers[0];
			
		
		for(int i = 1; allRollsAreNotTheSame ; i++)	
		{		
			System.out.println("inside main for loop run number: " + i);
			System.out.println("");
			allRollsAreNotTheSame = nums(numberofdice ,numbers ,uniqueRollValue);	
		}
	}	
	
	public static boolean nums(int numodice, int[] numbers, int uniqueRollValue)
	{
		boolean newRollsAreNotTheSame = true;
		for (int I = 1; I < numodice; I++)
		{
			System.out.println("I am in slot: " + I + " The value is: " + numbers[I] + " I am comparing to: " + uniqueRollValue );
			
			if (uniqueRollValue == numbers[I])											
			{	
				if (I == numodice - 1)
				{
					newRollsAreNotTheSame =	ending(I);
					return newRollsAreNotTheSame;
				}
			}
			else
			{	
				numbers = RollTheDice();
				uniqueRollValue = numbers[0];
				return newRollsAreNotTheSame;
			}
		}
		return newRollsAreNotTheSame;
	}
	
	
	
	
	public static boolean ending(int x)
	{
		System.out.println("it took " + x + " times");
		return false;
	}
	
	public static int[] RollTheDice()
	{
		int End = 5;
		int[] numbers = new int[End];
		int MaxRoll = 6;
		for (int idx = 0; idx < End; idx++)
		{	
			numbers[idx] = (GetRandomNumber(MaxRoll));
			System.out.print(numbers[idx] + " ");
		}
		System.out.println(" ");
		return numbers;
	}

	public static int GetRandomNumber(int max)
	{
		Random randomGenerator = new Random();
		return  randomGenerator.nextInt(max);
	}

}
