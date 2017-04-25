
public class Oven 
{
	public String description;
	public String color;
	public int height;
	public int width;
	public int length;
	public float price;
	public float maxTemperature;
	public String brand;
	public Door ovenDoor;
	public boolean gas;
	private int potatoCapacity;
	
	public Oven()
	{
		color = "chrome";
		ovenDoor = new Door();
	}
	
	public int getArea()
	{
		return length * width;
	}
}

