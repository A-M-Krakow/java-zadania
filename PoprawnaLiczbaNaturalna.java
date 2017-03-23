import java.util.Scanner;
public class PoprawnaLiczbaNaturalna
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Podaj liczbe!: ");
		String liczba = sc.nextLine();
		boolean poprawna = true;
		
		for (int i=0; i<liczba.length(); i++)
		{
			if (!Character.isDigit(liczba.charAt(i))) poprawna=false;
		}
		
		if (poprawna) System.out.println("Liczba jest poprawna");
		else System.out.println("Liczba NIE jest poprawna");
	}
}