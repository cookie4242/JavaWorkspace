
public class KitchenSimulator 
{
	static Oven largeOven;
	static Oven smallOven;
	
	public static void main(String[] args) 
	{		
		largeOven = new Oven();
		largeOven.length = 28;
		largeOven.height = 48;
		largeOven.width = 42;
		largeOven.gas = true;
		largeOven.maxTemperature = 550;
		System.out.println(largeOven.getArea());
		System.out.println(largeOven.maxTemperature);

		smallOven = new Oven();
		System.out.println(smallOven.color);
		
		int smallheight = smallOven.ovenDoor.height;
	}
}
