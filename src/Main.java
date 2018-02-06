
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		int val1 = 20;
		int val2 = 22;
		
		int x = 1;
		int y = 1;
		int z = 2;
		
		BlackJack(val1, val2);
		UniqueSum(x, y, z);
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
		
		System.out.println(val1 + " = " + result1 + " away.");
		System.out.println(val2 + " = " + result2 + " away.");
		
		if(result1 < result2)
			result = val1;
		
		if(result1 > result2)
			result = val2;
		
		if(result1 == result2)
			System.out.println("They are the same distance away.");
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
		System.out.println(result);
		return result;
	}
	
}
