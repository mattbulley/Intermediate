
public class Garage {
	Vehicle[] vehicles = new Vehicle[10];
	
	
	public float[] calculateBill()
	{
		float[] bill = new float[10];
		
		for(int i = 0; i < vehicles.length; i++) // cycles through all vehicles in garage
		{
			bill[i] = cycleThroughGarage(i, bill[i]);
		}
			
		
		
		return bill;
	}
	
	public float cycleThroughGarage(int counter, float bill)
	{
		switch(vehicles[counter].numberOfWheels)
		{
			case 1:
				bill += 30.0f;
				break;
			case 2:
				bill += 50.0f;
				break;
			case 3:
				bill += 70.0f;
				break;
			case 4:
				bill += 95.0f;
				break;
			case 5:
				bill += 105.0f;
				break;
			case 6:
				bill += 120.0f;
				break;
			case 7:
				bill += 130.0f;
				break;
			case 8:
				bill += 140.0f;
				break;
		}
		
		return bill;
	}
	
}
