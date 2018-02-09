import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		
		ident();
		selectChapter();

		
		System.out.println("6 : Paint Wizard");
		PaintWizard paintWizard = new PaintWizard();
		paintWizard.calculatCostPerSquareMeter();
		
		System.out.println("");
		System.out.println("7 : Working With Files");
		System.out.println("Creating array list of people...");
		System.out.println("");
		
		List<Person> personArrayList = new ArrayList<Person>();
		
		personArrayList.add(new Person("Matt", 67, "QA"));
		personArrayList.add(new Person("Bob", 32, "Shop Assistant"));
		personArrayList.add(new Person("Steve", 567, "Sales"));
		personArrayList.add(new Person("Amy", 212, "Management"));
		personArrayList.add(new Person("Joe", 05, "Constulting"));
		
		for(Person person : personArrayList) {
			System.out.println("NAME: " + person.name + " AGE: " + person.age + " JOB: " + person.jobTitle);
			String fileName = person.name + ".txt";
			 writeFile(person.name, person.age, person.jobTitle, fileName); 
			
		}
		
		System.out.println("");
		System.out.println("New array list being made");
		List<Person> personArrayList2 = new ArrayList<Person>();
		
		
		personArrayList2.add(readFile("Matt.txt"));
		System.out.println("reading Matt.txt");
		personArrayList2.add(readFile("Bob.txt"));
		System.out.println("reading Bob.txt");
		personArrayList2.add(readFile("Steve.txt"));
		System.out.println("reading Steve.txt");
		personArrayList2.add(readFile("Amy.txt"));
		System.out.println("reading Amy.txt");
		personArrayList2.add(readFile("Joe.txt"));
		System.out.println("reading Joe.txt");
		
		for(Person person : personArrayList2) {
			System.out.println("NAME: " + person.name + " AGE: " + person.age + " JOB: " + person.jobTitle);
		
			
		}
		scanner.close();
		
	}
	
	public static void ident() {
		System.out.println("\r\n" + 
				"  _____       _                               _ _       _       \r\n" + 
				" |_   _|     | |                             | (_)     | |      \r\n" + 
				"   | |  _ __ | |_ ___ _ __ _ __ ___   ___  __| |_  __ _| |_ ___ \r\n" + 
				"   | | | '_ \\| __/ _ \\ '__| '_ ` _ \\ / _ \\/ _` | |/ _` | __/ _ \\\r\n" + 
				"  _| |_| | | | ||  __/ |  | | | | | |  __/ (_| | | (_| | ||  __/\r\n" + 
				" |_____|_| |_|\\__\\___|_|  |_| |_| |_|\\___|\\__,_|_|\\__,_|\\__\\___|\r" + 
				"                                                                \r" + 
				
				 
				                                                                      
				
				" ____   ____   ____   ____   ____   ____   ____   ____   ____   ____  \r\n" + 
				"|____| |____| |____| |____| |____| |____| |____| |____| |____| |____| \r\n" + 
				"                                                                      \r\n" + 
				
				"");
		
		System.out.println("Created by Matt Bulley : Thursday, 8 February 2018");
		System.out.println("");
		contents();
	
	}
	
	public static void contents()
	{
		System.out.println("  Contents:");
		System.out.println("");
		System.out.println("	12  Blackjack");
		System.out.println("	13  Unique Sum");
		System.out.println("	14  Too Hot?");
		System.out.println("	15  People");
		System.out.println("	16  Garage");
		System.out.println("	17  Junit");
		System.out.println("	18  Library/TDD");
		System.out.println("");
		System.out.println("  Please enter a number (0 to quit program):");
	}
	
	public static void selectChapter() {
		boolean incorrectInput = true;
		int any = 0;
		scanner.reset();
		do {
			
			
			try {
					any = Integer.parseInt(scanner.nextLine());
					incorrectInput = false;
					
				} catch (Exception wrongInput) {
					
					System.out.println("");
					System.out.println("Incorrect input! Please enter a valid difficulty");
					
					
				}
			
			if(incorrectInput) {
				System.out.println("");
				System.out.println("Incorrect input! Please enter a valid difficulty");
			}
			
		} while (incorrectInput);
		
		switch(any) {
			case 12:
				chapter12();
				break;
			case 13:
				chapter13();
				break;
			case 14:
				chapter14();
				break;
			case 15:
				chapter15();
				break;
			case 16:
				chapter16();
				break;
			case 0:
				System.out.println("Goodbye");
				System.exit(0);
				break;
		
		}
		
	}
	
	public static int returnInput() {
		boolean incorrectInput = true;
		int any = 0;
		scanner.reset();
		do {
			
			
			try {
					any = Integer.parseInt(scanner.nextLine());
					incorrectInput = false;
					
				} catch (Exception wrongInput) {
					
					System.out.println("");
					System.out.println("Incorrect input! Please enter a valid difficulty");
					
					
				}
			
			if(incorrectInput) {
				System.out.println("");
				System.out.println("Incorrect input! Please enter a valid difficulty");
			}
			
		} while (incorrectInput);
		
		return any;
	}
	
	
	public static void chapter12() {
		System.out.println("");
		int val1 = 20;
		int val2 = 22;
		System.out.println("			(12) -- Blackjack");
		System.out.println("\r\n" + 
				".------..------..------..------..------..------..------..------..------.\r\n" + 
				"|B.--. ||L.--. ||A.--. ||C.--. ||K.--. ||J.--. ||A.--. ||C.--. ||K.--. |\r\n" + 
				"| :(): || :/\\: || (\\/) || :/\\: || :/\\: || :(): || (\\/) || :/\\: || :/\\: |\r\n" + 
				"| ()() || (__) || :\\/: || :\\/: || :\\/: || ()() || :\\/: || :\\/: || :\\/: |\r\n" + 
				"| '--'B|| '--'L|| '--'A|| '--'C|| '--'K|| '--'J|| '--'A|| '--'C|| '--'K|\r\n" + 
				"`------'`------'`------'`------'`------'`------'`------'`------'`------'\r\n"  
				);
		System.out.println("'Given 2 integer values greater than 0"
				+ ", return whichever value is closest ");
		System.out.println("to 21 without going over 21. If they both go over 21 then return 0. ");
		System.out.println();
		System.out.println("Enter integer 1:");
		val1 = returnInput();
		System.out.println("Enter integer 2:");
		val2 = returnInput();
		
		BlackJack(val1, val2);
		System.out.println();
		System.out.println();
		contents();
		selectChapter();
	}
	
	public static void chapter13() {
		int x = 1;
		int y = 1;
		int z = 2;
		System.out.println("			(13) -- Unique Sum");
		System.out.println("\r\n" + 
				" __ __  ____   ____   ___   __ __    ___       _____ __ __  ___ ___ \r\n" + 
				"|  |  ||    \\ |    | /   \\ |  |  |  /  _]     / ___/|  |  ||   |   |\r\n" + 
				"|  |  ||  _  | |  | |     ||  |  | /  [_     (   \\_ |  |  || _   _ |\r\n" + 
				"|  |  ||  |  | |  | |  Q  ||  |  ||    _]     \\__  ||  |  ||  \\_/  |\r\n" + 
				"|  :  ||  |  | |  | |     ||  :  ||   [_      /  \\ ||  :  ||   |   |\r\n" + 
				"|     ||  |  | |  | |     ||     ||     |     \\    ||     ||   |   |\r\n" + 
				" \\__,_||__|__||____| \\__,_| \\__,_||_____|      \\___| \\__,_||___|___|\r\n" + 
				"                                                                    \r\n" + 
				"");
		System.out.println("'Given 3 integer values, return their sum. If one value is the same as another value,\r\n" + 
				"they do not count towards the sum. Aka only return the sum of unique numbers\r\n" + 
				"given.'");
		System.out.println();
		System.out.println("Enter integer 1:");
		x = returnInput();
		System.out.println("Enter integer 2:");
		y = returnInput();
		System.out.println("Enter integer 3:");
		z = returnInput();
		UniqueSum(x, y, z);
		System.out.println();
		contents();
		selectChapter();
	}
	
	public static void chapter14() {
		System.out.println("			(14) -- Too Hot?");
		System.out.println("\r\n" + 
				" ______   ___    ___       __ __   ___   ______  _____ \r\n" + 
				"|      | /   \\  /   \\     |  |  | /   \\ |      |/     |\r\n" + 
				"|      ||     ||     |    |  |  ||     ||      ||  Y  |\r\n" + 
				"|_|  |_||  O  ||  O  |    |  _  ||  O  ||_|  |_||__|  |\r\n" + 
				"  |  |  |     ||     |    |  |  ||     |  |  |     |__|\r\n" + 
				"  |  |  |     ||     |    |  |  ||     |  |  |      __ \r\n" + 
				"  |__|   \\___/  \\___/     |__|__| \\___/   |__|     |__|\r\n" + 
				"                                                       \r\n" + 
				"");
		
		System.out.println("'Given an integer value and a Boolean value, temperature and isSummer, if temperature\r\n" + 
				"is between 60 and 90 (inclusive), unless its summer where the upper limit is\r\n" + 
				"100 instead of 90. Return true if the temperature falls within the range, false otherwise.'");
		System.out.println();
		System.out.println("Enter integer:");
		int integer = returnInput();
		System.out.println("Enter boolean(1/0):");
		int bool = returnInput();
		boolean bool2 = false;
		if(bool == 1)
			bool2 = true;
		if(bool == 0)
			bool2 = false;
		System.out.println(TooHot(integer, bool2));
		System.out.println();
		System.out.println();
		contents();
		selectChapter();
	}
	
	public static void chapter15() {
		Person person1 = new Person();
		person1.setData("Matt Bulley", 23, "QA");
		Person person2 = new Person();
		person2.setData("Dan", 22, "Uni");
		Person person3 = new Person();
		person3.setData("Al", 21, "Odeon");
		
		System.out.println("			(15) -- People");
		System.out.println("\r\n" + 
				"  ____   U _____ u U  ___ u  ____      _     U _____ u \r\n" + 
				"U|  _\"\\ u\\| ___\"|/  \\/\"_ \\/U|  _\"\\ u  |\"|    \\| ___\"|/ \r\n" + 
				"\\| |_) |/ |  _|\"    | | | |\\| |_) |/U | | u   |  _|\"   \r\n" + 
				" |  __/   | |___.-,_| |_| | |  __/   \\| |/__  | |___   \r\n" + 
				" |_|      |_____|\\_)-\\___/  |_|       |_____| |_____|  \r\n" + 
				" ||>>_    <<   >>     \\\\    ||>>_     //  \\\\  <<   >>  \r\n" + 
				"(__)__)  (__) (__)   (__)  (__)__)   (_\")(\"_)(__) (__) \r\n" + 
				"");
	
		System.out.println("");
		System.out.println("Create a Person class that models the following:\r\n" + 
				"• Name\r\n" + 
				"• Age\r\n" + 
				"• Job Title\r\n" + 
				"And has a method to return all three of these in a formatted string. (Override the\r\n" + 
				"toString() method!)\r\n" + 
				"Create some example objects with this class.\r\n" + 
				"Create an ArrayList and store those objects inside.\r\n" + 
				"Use an enhanced for loop to output all of your people to the console.\r\n" + 
				"Create a method that searches for the Person object by their name.");
		
		System.out.println("");
		System.out.println("Enter any number to continue");
		returnInput();
		
		System.out.println("Storing Objects...");
		Person[] personList = new Person[3];
		personList[0] = person1;
		personList[1] = person2;
		personList[2] = person3;
		
		System.out.println("Enter any number to continue");
		returnInput();
		
		System.out.println("");
		System.out.println("Outputting all people...");
		System.out.println("");
		for(int i = 0; i < personList.length; i++) {
			System.out.println(personList[i].returnString());
		}
		System.out.println("");
		System.out.println("Enter a word to search with:");
		String str = Integer.toString(returnInput());
		
		System.out.println();
		System.out.println("Searching for " + str + "...");
		searchPeople("Matt Bulley", personList);
		System.out.println();
		contents();
		selectChapter();
	}

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
		
		returnInput();
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
		
		returnInput();
		System.out.println("");
		garage.calculateBill();
		System.out.println("");
		System.out.println("...Creating Vehicle");
		Vehicle honda = garage.addVehicle(786543, "Car", "7XB3 532");
		returnInput();
		System.out.println("");
		System.out.println("direct reference...");
		System.out.println("ID: " + honda.ID + " Type: " + honda.type + " License: " + honda.licensePlate);
		returnInput();
		System.out.println("");
		System.out.println("referenced from garage array...");
		System.out.println("ID: " + garage.vehicles[3].ID + " Type: " + garage.vehicles[3].type + " License: " + garage.vehicles[3].licensePlate);
		returnInput();
		System.out.println("");
		System.out.println("removing...");
		garage.removeVehicle(786543, garage.vehicles);
		if(garage.vehicles[3] != null)
			System.out.println("ID: " + garage.vehicles[3].ID + " Type: " + garage.vehicles[3].type + " License: " + garage.vehicles[3].licensePlate);
		else
			System.out.println("vehicle removed");
		
		returnInput();
		System.out.println("");
		System.out.println("");
		System.out.println("Calculating bill for index 2");
		System.out.println(garage.fixVehicle(786543, garage.vehicles, 2));
		
		returnInput();
		System.out.println("");
		System.out.println("");
		System.out.println("Emptying Garage...");
		garage.emptyGarage(garage.vehicles);
		for(int i = 0; i < garage.vehicles.length; i++) {
			if(garage.vehicles[i] == null)
				System.out.println(" (" + i + ") is empty!");
		}
		
		System.out.println("");
		contents();
		selectChapter();
	}
	
	public static void writeFile(String _name, int _age, String _job, String _fileName) {
		
		try {
			WriteFile2 data = new WriteFile2(_fileName, false);
			WriteFile2 dataAppend = new WriteFile2(_fileName, true);
			data.WriteToFile(_name);
			dataAppend.WriteToFile(Integer.toString(_age));
			dataAppend.WriteToFile(_job);
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Text File Written to");
		
	}
	
	public static Person readFile(String _fileName) {
		
			String fileName = _fileName;

	        // This will reference one line at a time
	        String line = null;
	        String[] available = new String[3];
	        int i = 0;
	        String name = "";
	        String age = "";
	        String job = "";
	        
	        try {
	            // FileReader reads text files in the default encoding.
	            FileReader fileReader = 
	                new FileReader(fileName);

	            // Always wrap FileReader in BufferedReader.
	            BufferedReader bufferedReader = 
	                new BufferedReader(fileReader);

	            while((line = bufferedReader.readLine()) != null) {
	            	
	                available[i] = line;
	              //  System.out.println(i + " " + available[i]);
	                switch (i) {
	                	case 0:
	                		name = available[i];
	                		break;
	                	case 1:
	                		age = available[i];
	                		break;
	                	case 2:
	                		job = available[i];
	                		break;
	                
	                }
	                
	                
	                
	                i++;
	                
	            }   

	            // Always close files.
	            bufferedReader.close();         
	        }
	        catch(FileNotFoundException ex) {
	            System.out.println(
	                "Unable to open file '" + 
	                fileName + "'");                
	        }
	        catch(IOException ex) {
	            System.out.println(
	                "Error reading file '" 
	                + fileName + "'");                  
	            // Or we could just do this: 
	            // ex.printStackTrace();
	        }
	        
	        Person person = new Person(name, Integer.parseInt(age), job);
	        
	        return person;
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
