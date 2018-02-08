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
		
		
		int x = 1;
		int y = 1;
		int z = 2;
		
		Person person1 = new Person();
		person1.setData("Matt Bulley", 23, "QA");
		Person person2 = new Person();
		person2.setData("Dan", 22, "Uni");
		Person person3 = new Person();
		person3.setData("Al", 21, "Odeon");
		
		selectChapter();
		
		
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
		System.out.println("Calculating bill for index 2");
		System.out.println(garage.fixVehicle(786543, garage.vehicles, 2));
		
		System.out.println("");
		System.out.println("Emptying Garage...");
		garage.emptyGarage(garage.vehicles);
		for(int i = 0; i < garage.vehicles.length; i++) {
			if(garage.vehicles[i] == null)
				System.out.println(" (" + i + ") is empty!");
		}
		
		System.out.println("");
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
		System.out.println("  Please enter a number:");
	}
	
	public static void selectChapter() {
		boolean incorrectInput = true;
		int any = 0;
		scanner.reset();
		do {
			
			
			try {
					any = Integer.parseInt(scanner.nextLine());
					incorrectInput = false;
					if(any < 12 || any > 18)
						incorrectInput = true;
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
				chapter1();
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
					if(any < 12 || any > 18)
						incorrectInput = true;
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
	
	public static void chapter1() {
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
