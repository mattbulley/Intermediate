
public class PaintWizard {
	
	Paint[] paints = {
			new Paint("CheapoMax", 20, 19.99f, 10),
			new Paint("AverageJoes", 15, 17.99f, 11),
			new Paint("DuluxourousPaints", 10, 25f, 20)
	};

	public void calculatCostPerSquareMeter()
	{
		float[] calc = new float[3];
		
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
			
			System.out.println("£" + calc[i] / paints[i].costPerLitre + " per Sq Meter");
		}
		
		System.out.println("");
		System.out.println("DuluxourousPaints is the cheapest!");
		
		return;
	}
	
	
}
