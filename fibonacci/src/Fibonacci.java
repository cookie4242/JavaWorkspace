
public class Fibonacci {

	public static void main(String[] args) 
	{
		int end = 69;
			
		int[] fib = new int[end];
		fib[0] = 0;
		fib[1] = 1;
		
		for(int i = 2; i < end; i++)
		{
		    fib[i] = fib[i - 2] + fib[i - 1];
		}
		
		for(int i = 0; i < end; i++)
		{
			System.out.println(fib[i]);
		}
	}
}










































//	int end = 91;
//	long NMinusTwo = 0;
//	long NMinusOne = 1;
//	long N = 0;
//
//System.out.println("printing the Fibonacci Series\n\n" );
//	System.out.print("{" + NMinusTwo + "," + NMinusOne);
//	
//	for (int i = 0; i < end; i++)
//	{
//		N = NMinusTwo + NMinusOne;
//		NMinusTwo = NMinusOne;
//		NMinusOne = N;
//		System.out.print("," + N);
//	}
	//System.out.print("...n}");

//for(int idx = 0; idx < end; idx++)
//{
//	if (idx == 0)
//		
//		fib[idx] = 0;
//	
//	else if (idx == 1)
//		
//		fib[idx] = 1;
//	else
//	fib[idx] = fib[0] + fib[1];
//	
//}


	
	
//	int[] fib = new int[end];
//	for(int idx = 0; idx < end; idx++)
//	{
//		if (idx == 0)
//			
//			fib[idx] = 0;
//		
//		else if (idx == 1)
//			
//			fib[idx] = 1;
//		else
//		fib[idx] = fib[0] + fib[1];
//		
//	}
//	
//	for(int idx = 0; idx < end; idx++)	
//	{
//		System.out.print(fib[idx]);
//		System.out.print("  ");
//	}		







