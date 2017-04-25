public class FuncOne
{

	public static void main(String[] args)
	{		
		int base = 13;				
		int height = 7;		
		areaOfTriangle(base, height);
		
	}	
		 
		
		
	public static void areaOfTriangle(int x, int y)

	{		
		float area = .5f * x * y;		
		System.out.println("a triangle with a base of " + x + " and a hight of " + y + " has an area of " + area);	
		
	}		

	

}
