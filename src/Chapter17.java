
public class Chapter17 {
	public static void chapter17() {
		System.out.println("			(17) -- Paint Wizard");
		System.out.println("Create a paint requirement wizard that will calculate which of the following three\r\n" + 
				"products, would be the cheapest to buy, for the room you are painting.\r\n" + 
				"1) CheapoMax (20Litre) £19.99\r\n" + 
				"• This tin of paint will cover 10m2 per Litre\r\n" + 
				"2) AverageJoes (15 Litre) £17.99\r\n" + 
				"• This tin of paint will cover 11m2 per Litre\r\n" + 
				"3) DuluxourousPaints (10 Litre) £25\r\n" + 
				"• This tin of paint will cover 20m2 per Litre\r\n" + 
				"Work out which one wastes the least.\r\n" + 
				"Work out which is the cheapest paint brand to buy for any room.");
		
		Main.returnInput();
		
		
		PaintWizard paintWizard = new PaintWizard();
		paintWizard.calculatCostPerSquareMeter();
		
		System.out.println("");
		
		System.out.println("");
		Main.contents();
		Main.selectChapter();
	}
}
