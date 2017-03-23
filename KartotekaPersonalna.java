import java.util.Scanner;
public class KartotekaPersonalna
{
	enum Dane {IMIE, NAZWISKO, ROK_URODZENIA,  MIASTO, KOD_POCZTOWY};
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String[] kartoteka = new String[Dane.values().length];   // Tworze tablice zawierajaca tyle elementow ile jest pol w typie wyliczeniowym
		
		for (Dane poleDanych: Dane.values())					 // Dla kazdego z pol typu wyliczeniowego ( Dane.values() )
		{
			System.out.print(poleDanych + ": ");				// wyswietlam jego nazwe
			kartoteka[poleDanych.ordinal()] = sc.nextLine();	// oraz pozwalam wpisac tekst w komorce tablicy o numerze mojego pola danych (poleDanych.ordinal())
		}
		
		System.out.println("Dane osobowe: ");		
		
		for (Dane poleDanych : Dane.values())						// Dla kazdego z pol mojego typu wyliczeniowego
		{
			System.out.println(kartoteka[poleDanych.ordinal()]); // Wyswietlam zawartosc tablicy Kartoteka znajdujaca sie pod numerem tego pola
		}
		
	}
}