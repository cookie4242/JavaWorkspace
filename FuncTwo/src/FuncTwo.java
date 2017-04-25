
public class FuncTwo 
{

	public static void main(String[] args)
	
	{		
		int base = 13;				
		int height = 7;					System.out.print("A triangle with a base of " + base + " a height of" + height + "has an area of " + areaOfTriangle(base, height));	
			
		}	
			 
			
			
		public static float areaOfTriangle(int x, int y)

		{		
			float area = .5f * x * y;		
			return area;

	}

}
