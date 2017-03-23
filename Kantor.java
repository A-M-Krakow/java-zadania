import java.util.Scanner;
import java.util.Arrays;
public class zadaniePierwsze
{
	static void Kantor (double[] liczby)
	{
		final double JAKAS_STALA = 7,51;
			for (liczba : liczby)
			{
				liczby[liczba]*=JAKAS_STALA;
			}
		Arrays.sort(liczby);
		
		double sumaliczb = 0;
		
		for (liczba : liczby)
			{
				sumaLiczb+=liczba;
			}
		
		double najwiekszaLiczba = liczby[(liczby.length)-1];
		double najmniejszaLiczba = liczby[0];
		double sredniaLiczb = sumaLiczb/liczby.length;
		
		System.out.println(najwiekszaLiczba + " " + najmniejszaLiczba + " " + sredniaLiczb);
			
	}

	
	public static void main (String[] args)
	{
		double[] liczby = new liczby[10];
		Scanner sc = new Scanner(System.in);
		for (liczba : liczby)
		{
			System.out.println("Podaj liczbe numer " + liczba+1 );
			liczby[liczba]=sc.nextDouble();
		}
		
		Kantor(liczby);
	
	}
}