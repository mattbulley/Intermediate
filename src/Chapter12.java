
public class Chapter12 {
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
		val1 = Main.returnInput();
		System.out.println("Enter integer 2:");
		val2 = Main.returnInput();
		
		BlackJack(val1, val2);
		System.out.println();
		System.out.println();
		Main.contents();
		Main.selectChapter();
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
}
