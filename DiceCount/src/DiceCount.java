import java.util.Random;
public class DiceCount 
{

	public static void main(String[] args)
	{System.out.print("entering main");
		int MaxRoll = 6;
		int End = 10;
		int[] numbers = new int[End];
		int Chek = 0;
		int x = 0;
		int e = 1;
		boolean allRollsAreNotTheSame = true;
		
		//Make a loop and keep it running until all rolls of dice are the same
		System.out.print("entering main");
		for (int i = 1; allRollsAreNotTheSame; i++)
		{

			//Roll x number of dice
			System.out.print("getting numbers");
			for (int idx = 0; idx < End; idx++)
			{	
				numbers[idx] = (GetRandomNumber(MaxRoll));
				System.out.print(numbers[idx] + " ");
			}
			
			//Check to see if all roles are of the value n
			for(int idx = 0; idx < End; idx++)
			{
				if (numbers[idx] == e)
				{
					System.out.print(numbers[idx]);
				}
				else
				{
					break;
				}
				
			}
			
		}
	}
	

	public static void RollXDice ()
	{
		int End = 1000;
		int MaxRoll = 6;
		int[] added = new int[MaxRoll];
		int[] numbers = new int[End];
		
		for (int i = 0; i < End; i++)
		{	
			numbers[i] = (GetRandomNumber(MaxRoll));
			System.out.print(numbers[i] + " ");
		}
		
		for (int i = 0; i < End ; i++)
		{
			added[numbers[i]]++;
		}
		
		System.out.println(" ");
		
		for (int i = 0; i < MaxRoll; i++)
		{
		//	System.out.println("End is " + End + "    i is " + i + "    added[" + i + "] is " + added[i]);
			float Percent = ((float)added[i]/(float)End);
			System.out.println(i + "'s- " + Percent*100 + "%");	
		}
		
	}
	
	public static int GetRandomNumber(int max)
	{
		Random randomGenerator = new Random();
		return  randomGenerator.nextInt(max);
	}
}

/*
 * int counter =1;
 * int [] inarow = new int[MaxRoll];
 * for (i = 1, i < end, i++)
 * 	if numbers[i] == numbers[i-1]
 * 		counter = counter + 1;
 * 	else if ( counter > inarow[numbers[i]])
 * 		{
 * 			inarow[numbers[i]] = counter;
 * 			counter = 1;
  		}
*/