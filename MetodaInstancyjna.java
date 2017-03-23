public class MetodaInstancyjna
{
	int obliczSzescian (int liczba)
	{
		return liczba*liczba*liczba;
	}
	
	
	public static void main (String[] args)
	{
		int n = 4;
		MetodaInstancyjna obiekt = new MetodaInstancyjna();
		int wynik = obiekt.obliczSzescian(n);
		System.out.print("Wynik to: " + wynik);
		
		
	}
}