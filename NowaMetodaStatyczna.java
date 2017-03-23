import java.util.Scanner;

public class NowaMetodaStatyczna
{
	
	static void wyswietlTekst(String s)
	{
		System.out.println(s);
	}
	
	static int odczytajLiczbe(int i)
	{
		return i;
	}
	
	static int odczytajLiczbe(String napis)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Musisz wpisac liczbe!: ");
		int liczba = sc.nextInt();
		System.out.println(napis);
		return liczba;
		
	}
	
	
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Napisz cos!: ");
		String s = sc.nextLine();
		System.out.print("Napisz liczbe!: ");
		int i = sc.nextInt();
		
		
		wyswietlTekst(s);
		
		System.out.println(odczytajLiczbe(i));
		
		System.out.println(odczytajLiczbe("Jakis napis poprzedzajacy odczytanie liczby!"));
	}
	
	
}