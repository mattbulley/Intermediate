
public class Chapter14 {
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
		int integer = Main.returnInput();
		System.out.println("Enter boolean(1/0):");
		int bool = Main.returnInput();
		boolean bool2 = false;
		if(bool == 1)
			bool2 = true;
		if(bool == 0)
			bool2 = false;
		System.out.println(TooHot(integer, bool2));
		System.out.println();
		System.out.println();
		Main.contents();
		Main.selectChapter();
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
}
