import java.util.Scanner;
public class Monety
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Podaj kwote!: ");
		int kwota = sc.nextInt();
		
		int resztaPoOdjeciu5 = kwota%5;
		int resztaPoOdjeciu2 = resztaPoOdjeciu5%2;
		
		int piatki = kwota/5;
		int dwojki = resztaPoOdjeciu5/2;
		int jedynki = resztaPoOdjeciu2;
		
		System.out.println("Ilosc monet 5zl: " + piatki);
		System.out.println("Ilosc monet 2zl: " + dwojki);
		System.out.println("Ilosc monet 1zl: " + jedynki);
	}
	
}