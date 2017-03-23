import java.util.Scanner;
public class OdchylenieStandardowe
{
	double obliczOdchylenie (double liczby[])
	{
		double iloscLiczb = liczby.length;
		
		double sumaLiczb = 0;
		for (double liczba : liczby)
		{
			sumaLiczb +=liczba;
		}
		double sredniaLiczb = sumaLiczb/iloscLiczb;
		
		double sumaOdchylen = 0;	
		for (double liczba : liczby)
		{
			sumaOdchylen+=(liczba-sredniaLiczb)*(liczba-sredniaLiczb);
		}
		
		double podPierwiastkiem = sumaOdchylen/iloscLiczb;
		double S = Math.sqrt(podPierwiastkiem);
		
		return S;
	}
	
	
	public static void main (String[] args) 
	{
		double liczby[] = {1,7,8,5,9}; 
		
		OdchylenieStandardowe obiekt = new OdchylenieStandardowe();
		double  wynik = obiekt.obliczOdchylenie(liczby);
		System.out.println("Odchylenie to: " + wynik);

	}

}