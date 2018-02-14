import java.util.Scanner;

public class PaintWizard {
	
	Paint[] paints = {
			new Paint("CheapoMax", 20, 19.99f, 10),
			new Paint("AverageJoes", 15, 17.99f, 11),
			new Paint("DuluxourousPaints", 10, 25f, 20)
	};

	public void calculatCostPerSquareMeter()
	{
		float[] calc = new float[3];
		float[] calc2 = new float[3];
		int total = 0;
		
		for(int i = 0; i < paints.length; i++)
		{
			System.out.print(paints[i].name + " : ");
			calc[i] = (paints[i].coverage * paints[i].volume);
			System.out.println(calc[i] + " Sq Meters");
		}
		
		System.out.println("");
		
		for(int i = 0; i < paints.length; i++)
		{
			System.out.print(paints[i].name + " : ");
			calc2[i] = (calc[i] / paints[i].costPerLitre);
			System.out.println("£" + calc2[i]  + " per Sq Meter");
		}
		
		System.out.println("");
		System.out.println("DuluxourousPaints is the cheapest!");
		System.out.println("What dimensions are your room? ... ");
		System.out.println("Width: ");
		
		int dimensionsWidth = Main.returnInput();
		System.out.println("Height: ");
		int dimensionsHeight = Main.returnInput();
		System.out.println("Depth: ");
		int dimensionsDepth = Main.returnInput();
		
		
		
			total = ((dimensionsWidth * dimensionsHeight) * 2) + ((dimensionsDepth * dimensionsHeight) * 2);
			System.out.println("Total area = " + total);
		
		
		for(int i = 0; i < paints.length; i++)
		{
			System.out.print(paints[i].name + " : ");
			
			System.out.println("£" + (total * calc2[i])  + " for the room");
			System.out.println((calc[i] / total)  + " buckets of paint.");
		}
		
		
		return;
	}
	
	
}
