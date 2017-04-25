
public class Cactus 
{
	public String color = "Green";
	public int height = 30;
	public String heightUnit = "FT";
	
	public boolean CanFlower()
	{
		if (height > 4)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}