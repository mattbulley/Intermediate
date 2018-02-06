
public class Garage {
	Vehicle[] vehicles = new Vehicle[10];
	
	
	public float[] calculateBill()
	{
		float[] bill = new float[10];
		for(Vehicle vehicle : vehicles) // cycles through all vehicles in garage
		{
			if(vehicle != null) {
				System.out.print(" " + vehicle.typeOfVehicle + " : ");
				System.out.println("£" + billsForWheels(vehicle));
			}
		}
		return bill;
	}
	
	public float billsForWheels(Vehicle _vehicle)
	{
		float bill = 0f;
		
		switch(_vehicle.numberOfWheels)
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
	
	public Vehicle addVehicle(int ID, String type, String licensePlate)
	{
		Vehicle _vehicle = new Vehicle(ID, type, licensePlate);
		for(int i = 0; i < this.vehicles.length; i++)
		{
			if(vehicles[i] == null) {
				this.vehicles[i] = _vehicle;
				return _vehicle;
			}
		}
		return _vehicle;
	}
	
	public void removeVehicle(int ID, Vehicle[] list) // TODO add parameters for vehicle type and license number
	{
		for(int i = 0; i < list.length; i++) {
			if(list[i] != null) {
				if(list[i].ID == ID) {
					list[i] = null;
				}
			}
		}
	}
	
	public float fixVehicle(int ID, Vehicle[] list, int arrayIndex)
	{
		float[] cost = calculateBill();
		return cost[arrayIndex];
	}
	
	public void emptyGarage(Vehicle[] list)
	{
		for(int i = 0; i < list.length; i++) {
				list[i] = null;
		}
	}
	
}
