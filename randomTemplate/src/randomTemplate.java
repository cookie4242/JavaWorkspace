import java.util.Random;

public class randomTemplate
{

	public static void main(String[] args)
	{	
			
		Random randomGenerator = new Random();
		int sidesOfDice = 15005;
		int currentRoll = randomGenerator.nextInt(sidesOfDice);
		int counter = 0;
		int dicehighnum = 15000;
		int lastroll = 0; 

		
		counter = rolldicenumber(currentRoll, dicehighnum, counter, sidesOfDice, randomGenerator);
		test(currentRoll, lastroll, sidesOfDice, dicehighnum, counter, randomGenerator);
	}
	
	public static int rolldicenumber(int currentRoll, int dicehighnum , int counter , int sidesOfDice, Random randomGenerator)
	{
		while (currentRoll < dicehighnum)
		{
			currentRoll = randomGenerator.nextInt(sidesOfDice);
		//    System.out.println("newran is " + currentRoll + " "  );
		    counter++; 
		}
		System.out.println("It took " + counter + " rolls to get above " + dicehighnum + " on my " + sidesOfDice + " sided die.");
		return counter;
	}
	
	public static void test(int currentRoll, int lastroll, int sidesOfDice, int dicehighnum, int counter, Random randomGenerator)
	{
		int newcounter = 2;
		currentRoll = randomGenerator.nextInt(sidesOfDice);
		lastroll = currentRoll;
		currentRoll = randomGenerator.nextInt(sidesOfDice);
		while(!(lastroll == currentRoll))	
		{
			lastroll = currentRoll;
			currentRoll = randomGenerator.nextInt(sidesOfDice);
		 //   System.out.println(lastroll + " = " + currentRoll + " "  );
		    newcounter++;
		}
	//	System.out.println("It took " + counter + " rolls to get above " + dicehighnum + " on my " + sidesOfDice + " sided die.");
		System.out.print("I rolled an additional " + newcounter + " times to get two of the same number in a row on my " + sidesOfDice + " sided die");
			
	}

}