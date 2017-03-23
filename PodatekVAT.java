public class PodatekVAT
{
	public static void main (String[] args)
	{
		System.out.println("Nazwa towaru: " + args[0]);
		double netto = Double.parseDouble(args[1]);
		System.out.println("Cena netto: " + netto);
		final double VAT = 0.22;
		System.out.println("Stawka VAT: " + (VAT*100) + "%");
		System.out.println("Wartosc VAT: " + (netto*VAT));
		System.out.println("Cena brutto: " + (netto+netto*VAT));	
	}
}