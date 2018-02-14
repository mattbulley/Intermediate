import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Chapter18 {
	public static void chapter18() {
		System.out.println("			(18) -- Working With Files");
		System.out.println("");
		
		Main.returnInput();
		
		
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
		
		
		System.out.println("");
		Main.contents();
		Main.selectChapter();
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
	

}
