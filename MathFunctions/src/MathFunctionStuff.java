public class MathFunctionStuff
{
	public MathFunctionStuff() 
	{
		
	}

	public void areaOfSquare(int x)
	{		
		int area =  x * x;		
		System.out.println("a Square with a base of " + x + " and a height of " + x + " has an area of " + area);				
	}
	
	public int mult(int number1 , int number2)
	{	
		int answer = number1 * number2;	
		return answer;		
	}
	
	public void areaOfTriangle(int x, int y)
	{		
		float area = .5f * x * y;		
		System.out.println("a triangle with a base of " + x + " and a hight of " + y + " has an area of " + area);	
	}	
}
