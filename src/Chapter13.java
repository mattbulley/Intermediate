
public class Chapter13 {
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
		x = Main.returnInput();
		System.out.println("Enter integer 2:");
		y = Main.returnInput();
		System.out.println("Enter integer 3:");
		z = Main.returnInput();
		UniqueSum(x, y, z);
		System.out.println();
		Main.contents();
		Main.selectChapter();
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
}
