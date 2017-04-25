
public class For
{
	public static void main(String[] args) 
	{
		countdown(45);
		laugh(5);
		System.out.println("This is a test " + 0);
		
		for(int i = 4; i < 11; i++)
		{
			skipCount(i);
		}
	}	
	
	public static void countdown(int countdown)
	{
		for (int i2 = countdown; i2 > -1; i2--)
		{
			System.out.println("count down ends in " + i2);
		}	
	}
	
	public static void laugh(int maxLaugh)	  
	{
		for(int i = 0; i < maxLaugh; i++ )
		{
			System.out.println("hee hee");
		}
	}
	
	public static void skipCount(int skipCountBy)
	{
		System.out.println("\nI can count by " + skipCountBy + "'s");
		for (int i = skipCountBy; i < 100; i += skipCountBy)
		{	
			System.out.print(" " + i);
		}	
	}
}
