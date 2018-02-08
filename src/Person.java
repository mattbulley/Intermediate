
public class Person {

	String name;
	int age;
	String jobTitle;
	
	public Person(String _name, int _age, String _jobTitle)
	{
		name = _name;
		age = _age;
		jobTitle = _jobTitle;
	}
	
	public Person()
	{
		
	}
	
	public void setData(String _name, int _age, String _jobTitle)
	{
		name = _name;
		age = _age;
		jobTitle = _jobTitle;
	}
	
	public String returnString()
	{
		String returnString = "";
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(name);
		sb.append(" : ");
		sb.append(age);
		sb.append(" : ");
		sb.append(jobTitle);
		returnString = sb.toString();
		
		
		return returnString;
	}
	
}
