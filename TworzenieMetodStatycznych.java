import java.util.Scanner;
public class TworzenieMetodStatycznych
{
	static void wyswietlTekst(String s)
	{
		System.out.println(s);
	}
	
	static int odczytajLiczbe(int i)
	{
		return i;
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
		
		
		
		
	}
}