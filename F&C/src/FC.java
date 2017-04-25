
public class FC 
{

	public static void main(String[] args) 
	{
	
		Float F = 212f;
		FtoC(F);
	}
	
	
	public static void FtoC(float x)
	{
		 double C = ((x - 32 ) * 0.5556);
		System.out.print(x + " Fahrenheit" + " = " + C + " degrees celsius");
	}
}
