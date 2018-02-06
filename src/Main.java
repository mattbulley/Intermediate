
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		int val1 = 20;
		int val2 = 22;
		
		int x = 1;
		int y = 1;
		int z = 2;
		
		Person person1 = new Person();
		person1.setData("Matt Bulley", 23, "QA");
		Person person2 = new Person();
		person2.setData("Dan", 22, "Uni");
		Person person3 = new Person();
		person3.setData("Al", 21, "Odeon");
		
		
		System.out.println("1 : BlackJack");
		BlackJack(val1, val2);
		System.out.println();
		System.out.println("2 : UniqueSum");
		UniqueSum(x, y, z);
		System.out.println();
		System.out.println("3 : Too Hot?");
		System.out.println(TooHot(100, true));
		System.out.println();
		System.out.println("4 : People");
	
		
		Person[] personList = new Person[3];
		personList[0] = person1;
		personList[1] = person2;
		personList[2] = person3;
		
		for(int i = 0; i < personList.length; i++) {
			System.out.println(personList[i].returnString());
		}
		
		System.out.println();
		searchPeople("Matt Bulley", personList);
		System.out.println();
		System.out.println("5 : Garage");
		
		Car car1 = new Car();
		car1.typeOfVehicle = "Car";
		car1.numberOfDoors = 3;
		car1.numberOfWheels = 4;
		
		Motorcycle motorCycle1 = new Motorcycle();
		motorCycle1.typeOfVehicle = "Bike";
		motorCycle1.numberOfDoors = 0;
		motorCycle1.numberOfWheels = 2;
		
		Bus bus1 = new Bus();
		bus1.typeOfVehicle = "Bus";
		bus1.numberOfDoors = 1;
		bus1.numberOfWheels = 8;
		
		Garage garage = new Garage();
		garage.vehicles[0] = car1;
		garage.vehicles[1] = motorCycle1;
		garage.vehicles[2] = bus1;
		
		garage.calculateBill();
		System.out.println("");
		System.out.println("...Creating Vehicle");
		Vehicle honda = garage.addVehicle(786543, "Car", "7XB3 532");
		System.out.println("direct reference...");
		System.out.println("ID: " + honda.ID + " Type: " + honda.type + " License: " + honda.licensePlate);
		System.out.println("referenced from garage array...");
		System.out.println("ID: " + garage.vehicles[3].ID + " Type: " + garage.vehicles[3].type + " License: " + garage.vehicles[3].licensePlate);
		System.out.println("removing...");
		garage.removeVehicle(786543, garage.vehicles);
		if(garage.vehicles[3] != null)
			System.out.println("ID: " + garage.vehicles[3].ID + " Type: " + garage.vehicles[3].type + " License: " + garage.vehicles[3].licensePlate);
		else
			System.out.println("vehicle removed");
		
		System.out.println("");
		System.out.println("Calculating bill");
		System.out.println(garage.fixVehicle(786543, garage.vehicles, 2));
		
		System.out.println("");
		System.out.println("Emptying Garage...");
		garage.emptyGarage(garage.vehicles);
		for(int i = 0; i < garage.vehicles.length; i++) {
			if(garage.vehicles[i] == null)
				System.out.println(" (" + i + ") is empty!");
		}
		
	}
	
	public static int BlackJack(int val1, int val2)
	{
		int result1 = 0;
		int result2 = 0;
		
		int result = 0;
		
		if(val1 > 21)
			result1 = (val1 % 21);
		if(val1 < 21)
			result1 = (21 - val1);
		if(val2 > 21)
			result2 = (val2 % 21);
		if(val2 < 21)
			result2 = (21 - val2);
		
		System.out.println(" " + val1 + " = " + result1 + " away.");
		System.out.println(" " + val2 + " = " + result2 + " away.");
		
		if(result1 < result2)
			result = val1;
		
		if(result1 > result2)
			result = val2;
		
		if(result1 == result2)
			System.out.println(" They are the same distance away.");
		else
			System.out.println(result + " is closer.");
		
		return result;
	}

	public static int UniqueSum(int x, int y, int z)
	{
		int result = 0;
		int newX = x;
		int newY = y;
		int newZ = z;
		
		if(x == y) {
			newY = 0;
			newX = 0;
		}
		
		if(x == z) {
			newZ = 0;
			newX = 0;
		}
		
		if(y == z) {
			newZ = 0;
			newY = 0;
		}
		
		if(x == y && y ==z)
		{
			newY = 0;
			newZ = 0;
			newX = 0;
		}
		
		result = (newX + newY + newZ); 	
		System.out.println(" " + result);
		return result;
	}
	
	public static boolean TooHot(int temperature, boolean isSummer)
	{
		boolean value = false;
		if(isSummer) {
			if(temperature >= 60 && temperature <= 100)
				value = true;
		}
		if(temperature >= 60 && temperature <= 90){
			value = true;
		}
		
		return value;
	}

	public static Person searchPeople(String _name, Person[] _personList)
	{
		Person p = new Person();
		for(int i = 0; i < _personList.length; i++)
		{
			if(_name.equals(_personList[i].name)) {
				System.out.println("Found: " + _personList[i].name);
			}
		}
		return p;
	}
	
	
}
