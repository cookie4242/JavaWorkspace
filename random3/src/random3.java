import java.util.Random;

public class random3 
{

	public static void main(String[] args) 
	{
		PrintMyName("Edward", 9000);
	}
	
	public static void PrintMyName(String name, int number)
	{
		int runCount = 0;
		while(runCount < number)
		{
			System.out.println(name);
			runCount++;
		}
	}
}


//Random randomGenerator = new Random();
//int maxnum = 100;
//int dice = randomGenerator.nextInt(maxnum);
//int counter = 2;
//int lastRoll = dice;
//dice = randomGenerator.nextInt(maxnum);
//
//while (!(lastRoll == dice))
//{
//lastRoll = dice;
// dice = randomGenerator.nextInt(maxnum);
//System.out.println(lastRoll + " = " + dice + " "  );
//counter++;
//}
//System.out.print("I rolled " + counter + " times");
//
//}
