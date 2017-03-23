import java.util.Scanner;
public class AnalizaWyrazow
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Wpisz cos: ");
		String zdanie = sc.nextLine();
		
		String[] podzieloneZdanie = zdanie.split(" ", 0);
		
		for (int wyraz = 0; wyraz<podzieloneZdanie.length; wyraz++)
		{
			System.out.println(podzieloneZdanie[wyraz]);
		}
	}
}