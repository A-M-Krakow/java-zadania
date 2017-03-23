public class InwersjaWektora
{
	static void odwracanieTablicy (int[] tablica)
	{
		for (int i=0; i<((tablica.length-1)/2); i++)
		{
			int bufor = tablica[i]; 
			tablica[i]=tablica[(tablica.length-1)-i];
			tablica[(tablica.length-1)-i] = bufor;
		} 
		
		
		for (int liczba : tablica)
		{
			System.out.println(liczba);
		}
	}
	
	
	
	
	
	
	public static void main (String[] args)
	{
		int[] tablica = {1,2,3,4,5,6,7,8,9};
		odwracanieTablicy(tablica);
	}
}