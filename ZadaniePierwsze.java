import java.util.Scanner;
import java.util.Arrays;
public class ZadaniePierwsze
{
	static void Kantor (double[] liczby)
	{
		final double JAKAS_STALA = 7.51;
			for (double liczba : liczby)
			{
				liczba*=JAKAS_STALA;
			}
		Arrays.sort(liczby);
		
		double sumaLiczb = 0;
		
		for (double liczba : liczby)
			{
				sumaLiczb+=liczba;
			}
		
		double najwiekszaLiczba = liczby[(liczby.length)-1];
		double najmniejszaLiczba = liczby[0];
		double sredniaLiczb = sumaLiczb/liczby.length;
		
		System.out.println("Najwieksza liczba to: " + najwiekszaLiczba);
		System.out.println("Najmniejsza liczba to: " + najmniejszaLiczba);
		System.out.println("Srednia liczb to:  " + sredniaLiczb);
			
	}

	
	public static void main (String[] args)
	{
		double[] liczby = new double[10];
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<10; i++)
		{
			System.out.println("Podaj liczbe numer " + (i+1)) ;
			liczby[i]=sc.nextDouble();
		}
		
		Kantor(liczby);
	
	}
}