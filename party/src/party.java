public class party {

	//This is a test
	public static void main(String[] args) 
	{
		int cigars = 39;
		boolean	isWeekend = false;
			
		if (isWeekend && cigars > 39)	
		{
			System.out.print("success1");	
		}
		else
		{
			if (!isWeekend && cigars > 39 && cigars < 61)
			{
				System.out.print("success2");	
			}
	    	else	
	    	{
	    		System.out.print ("Awwww Nuts");	
	    	}
		}
	}
}
