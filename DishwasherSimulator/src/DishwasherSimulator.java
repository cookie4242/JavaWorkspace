
public class DishwasherSimulator {

	private static Washable[] washableThings;
	
	/**
	 * Run a dishwasher when it is 75% full
	 */
	public static void main(String[] args) 
	{
		washableThings = new Washable[10];
		
		CrockPot grandmasPot = new CrockPot();
		Fork granpapasFork = new Fork();
		
		washableThings[0] = grandmasPot;
		washableThings[1] = granpapasFork;
		
		float totalWashableSpace = 0;
		
		for (int i = 0; i < 2; i++)
		{
			totalWashableSpace += washableThings[i].washableSpace;
		}
		
		System.out.print(totalWashableSpace);
	}
	

}
