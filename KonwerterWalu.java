public class KonwerterWalu
{
	public static void main (String[] args)
	{
		double USD = Double.parseDouble (args[0]);
		double kurs = Double.parseDouble (args[1]);
		
		System.out.println("Kwota wyrazona w USD to: " + USD);
		System.out.println("Kurs wymiany to: " + kurs);
		double EUR = USD*kurs;
		System.out.println("Kwota wyrazona w USD to: " + EUR );
	}
}