import java.util.Scanner;
public class Konwencje 
{
	public static void main (String[] args) 
	{
		final double STAWKA_VAT = 1.22;
		double kwotaNetto, kwotaBrutto;
		Scanner SK = new Scanner(System.in);
		System.out.print ("Podaj kwote netto: ");
		kwotaNetto = SK.nextDouble();
		kwotaBrutto = kwotaNetto * STAWKA_VAT;
		System.out.println ("Kwota Netto: " + kwotaNetto + " Kwota brutto: " +
		kwotaBrutto);
	}
}