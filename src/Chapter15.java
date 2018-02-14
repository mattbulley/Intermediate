
public class Chapter15 {
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
		Main.returnInput();
		
		System.out.println("Storing Objects...");
		Person[] personList = new Person[3];
		personList[0] = person1;
		personList[1] = person2;
		personList[2] = person3;
		
		System.out.println("Enter any number to continue");
		Main.returnInput();
		
		System.out.println("");
		System.out.println("Outputting all people...");
		System.out.println("");
		for(int i = 0; i < personList.length; i++) {
			System.out.println(personList[i].returnString());
		}
		System.out.println("");
		System.out.println("Enter a word to search with:");
		String str = Integer.toString(Main.returnInput());
		
		System.out.println();
		System.out.println("Searching for " + str + "...");
		searchPeople("Matt Bulley", personList);
		System.out.println();
		Main.contents();
		Main.selectChapter();
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
