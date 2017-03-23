import java.util.Scanner;
public class LiczbyPierwsze
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Ile liczb pierwszych wyswietlic?: ");
		
		long wyswietlonaIloscLiczb = 0;
		long iloscLiczbDoWyswietlenia = sc.nextLong();
		
		
			for (long badana=1; ; badana++)									// Wyliczanie badanych liczb po kolei do sprawdzenia (nieskonczony zakres)
			{
				
				boolean pierwsza = true;									// Kazda badana jest podejrzewana o bycie pierwsza. 
				
				if (wyswietlonaIloscLiczb==iloscLiczbDoWyswietlenia) break; // Jezeli wyswietlono juz zadana ilosc liczb, przerwanie sprawdzania.
				
				else
				{	
			
					for (long j=2; j<badana; j++) 							// Wyliczanie zakresu liczb (1,badana) zeby sprawdzic podzielnosc badanej przez kazda z nich
					{
						
						if ((badana%j)==0) 									// Jezeli badana jest podzielna przez liczbe z zakresu (1,badana)
						{
							pierwsza = false;  								// Liczba badana nie jest juz pierwsza.
							break;
						}
						
					}
				
					if (pierwsza==true)  									// Jeżeli badana jest pierwsza
					{	
						System.out.print(badana + " ");						// Wyswietlenie badanej
						wyswietlonaIloscLiczb++;							// Zwiekszenie licznika juz wyswietlonych liczb o 1
							
					}

				}

			}
			
			
	}
}