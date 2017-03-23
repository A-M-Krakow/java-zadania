import java.util.Scanner;
public class ZWielkiejLitery
{
	public static void main (String[] args)
	{
		System.out.println("Podaj imie i nazwisko: ");
		Scanner sc = new Scanner(System.in);
		String dane = sc.nextLine();
		String imie = (dane.split(" ")[0]);
		String nazwisko = (dane.split(" ")[1]);
		
		imie = (imie.substring(0,1).toUpperCase() + imie.substring(1).toLowerCase());
		nazwisko = (nazwisko.substring(0,1).toUpperCase() + nazwisko.substring(1).toLowerCase());
		dane = (imie + " " + nazwisko);
		System.out.println(dane);
		
	}
}