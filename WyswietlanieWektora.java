public class WyswietlanieWektora
{
	static void odwracanieTablicy (int[] tablica)
	{
		for (int i=0; i<((tablica.length-1)/2); i++)
		{
			int bufor = tablica[i]; 
			tablica[i]=tablica[(tablica.length-1)-i];
			tablica[(tablica.length-1)-i] = bufor;
		} 
		
		
		wyswietlWektor(tablica);
	}
	
	static void wyswietlWektor (int[] wektor)
	{
		for (int liczba : wektor)
		{
			System.out.print(liczba + "\t");
		}
		System.out.print("\n");
	}
	
	
	
	
	
	
	public static void main (String[] args)
	{
		int[] tablica = {1,2,3,4,5,6,7,8,9};
		wyswietlWektor(tablica);
		odwracanieTablicy(tablica);
	}
}