
public class Chapter16 {
	public static void chapter16() {
		System.out.println("			(16) -- Garage");
		System.out.println("\r\n" + 
				"         _              _                   _           _                   _              _      \r\n" + 
				"        /\\ \\           / /\\                /\\ \\        / /\\                /\\ \\           /\\ \\    \r\n" + 
				"       /  \\ \\         / /  \\              /  \\ \\      / /  \\              /  \\ \\         /  \\ \\   \r\n" + 
				"      / /\\ \\_\\       / / /\\ \\            / /\\ \\ \\    / / /\\ \\            / /\\ \\_\\       / /\\ \\ \\  \r\n" + 
				"     / / /\\/_/      / / /\\ \\ \\          / / /\\ \\_\\  / / /\\ \\ \\          / / /\\/_/      / / /\\ \\_\\ \r\n" + 
				"    / / / ______   / / /  \\ \\ \\        / / /_/ / / / / /  \\ \\ \\        / / / ______   / /_/_ \\/_/ \r\n" + 
				"   / / / /\\_____\\ / / /___/ /\\ \\      / / /__\\/ / / / /___/ /\\ \\      / / / /\\_____\\ / /____/\\    \r\n" + 
				"  / / /  \\/____ // / /_____/ /\\ \\    / / /_____/ / / /_____/ /\\ \\    / / /  \\/____ // /\\____\\/    \r\n" + 
				" / / /_____/ / // /_________/\\ \\ \\  / / /\\ \\ \\  / /_________/\\ \\ \\  / / /_____/ / // / /______    \r\n" + 
				"/ / /______\\/ // / /_       __\\ \\_\\/ / /  \\ \\ \\/ / /_       __\\ \\_\\/ / /______\\/ // / /_______\\   \r\n" + 
				"\\/___________/ \\_\\___\\     /____/_/\\/_/    \\_\\/\\_\\___\\     /____/_/\\/___________/ \\/__________/   \r\n" + 
				"                                                                                                  \r\n" + 
				"");
		System.out.println("");
		System.out.println("Using Vehicle as a base class, create three derived classes (car, motorcycle etc.),\r\n" + 
				"each derived class should have its own individual attribute in addition to the normal\r\n" + 
				"Vehicle attributes that it inherits.\r\n" + 
				"Using a List implementation store all your vehicles in a Garage class (e.g. ArrayList)\r\n" + 
				"Create a method in Garage that iterates through each Vehicle, calculating a bill for\r\n" + 
				"each type of Vehicle in a different way, depending on the type of vehicle it is.\r\n" + 
				"Garage should have methods that add Vehicle, remove Vehicle(s) (By ID, By Vehicle\r\n" + 
				"Type) fix Vehicle (Calculate bill) and empty the garage.");
		
		Main.returnInput();
		System.out.println("");
		System.out.println("Creating vehicles...");
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
		
		Main.returnInput();
		System.out.println("");
		garage.calculateBill();
		System.out.println("");
		System.out.println("...Creating Vehicle");
		Vehicle honda = garage.addVehicle(786543, "Car", "7XB3 532");
		Main.returnInput();
		System.out.println("");
		System.out.println("direct reference...");
		System.out.println("ID: " + honda.ID + " Type: " + honda.type + " License: " + honda.licensePlate);
		Main.returnInput();
		System.out.println("");
		System.out.println("referenced from garage array...");
		System.out.println("ID: " + garage.vehicles[3].ID + " Type: " + garage.vehicles[3].type + " License: " + garage.vehicles[3].licensePlate);
		Main.returnInput();
		System.out.println("");
		System.out.println("removing...");
		garage.removeVehicle(786543, garage.vehicles);
		if(garage.vehicles[3] != null)
			System.out.println("ID: " + garage.vehicles[3].ID + " Type: " + garage.vehicles[3].type + " License: " + garage.vehicles[3].licensePlate);
		else
			System.out.println("vehicle removed");
		
		Main.returnInput();
		System.out.println("");
		System.out.println("");
		System.out.println("Calculating bill for index 2");
		System.out.println(garage.fixVehicle(786543, garage.vehicles, 2));
		
		Main.returnInput();
		System.out.println("");
		System.out.println("");
		System.out.println("Emptying Garage...");
		garage.emptyGarage(garage.vehicles);
		for(int i = 0; i < garage.vehicles.length; i++) {
			if(garage.vehicles[i] == null)
				System.out.println(" (" + i + ") is empty!");
		}
		
		System.out.println("");
		Main.contents();
		Main.selectChapter();
	}
}
