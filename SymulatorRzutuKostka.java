import java.util.Scanner;
public class SymulatorRzutuKostka
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Ile rzutow kostka zasymulowac?: ");
		int iloscRzutow = sc.nextInt(); 
		int[] tablicaRzutow = new int[iloscRzutow];
		int[] sumaOczek = new int[6];
		
		for (int licznik = 0; licznik<iloscRzutow; licznik++)
		{
			tablicaRzutow[licznik] = (int)(Math.random() * 6 + 1);
			
			switch (tablicaRzutow[licznik]) 
			{
				case 1: sumaOczek[0] +=1; break;
				case 2: sumaOczek[1] +=1; break;
				case 3: sumaOczek[2] +=1; break;
				case 4: sumaOczek[3] +=1; break;
				case 5: sumaOczek[4] +=1; break;
				case 6: sumaOczek[5] +=1; break;
			}
			
			
			/* System.out.println("Rzut " + licznik + ": " + tablicaRzutow[licznik]); */
		}
		
		
		System.out.println("Rezultat " + iloscRzutow +  " rzutow kostka");
		System.out.println("=========================");
		System.out.println("Liczba oczek | Liczebnosc");
		System.out.println("-------------------------");
		System.out.println("     1       |      " + sumaOczek[0]);
		System.out.println("     2       |      " + sumaOczek[1]);
		System.out.println("     3       |      " + sumaOczek[2]);
		System.out.println("     4       |      " + sumaOczek[3]);
		System.out.println("     5       |      " + sumaOczek[4]);
		System.out.println("     6       |      " + sumaOczek[5]);
		
		
		
		
		
		
		
		
		
	}
}