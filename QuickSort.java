import java.util.Arrays;
import java.util.Scanner;

public class QuickSort 
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Ile liczb chcesz wygenerowac?: ");
		int iloscLiczb = sc.nextInt();
		int[] tablicaLiczb = new int[iloscLiczb] ;
		System.out.print("Podaj poczatek przedzialu: ");
		int a = sc.nextInt();
		System.out.print("Podaj koniec przedzialu: ");
		int b = sc.nextInt();
		
		for (int liczba = 0; liczba<iloscLiczb; liczba++)
		{
			tablicaLiczb[liczba] = (int)(Math.random()*(b-a+1) + a);
		}
		
		Arrays.sort(tablicaLiczb);
		
		for (int x : tablicaLiczb)
		{
			System.out.println(x);
		}
		
	}
}