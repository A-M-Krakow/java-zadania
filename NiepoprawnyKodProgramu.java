public class NiepoprawnyKodProgramu 
{
			public static void main(String[] args)
			{
				String nazwaOperacji = "Obliczanie podatku VAT";
				double  stawkaVAT;
				double podatekVAT;
				double kwotaBrutto;
				double kwotaNetto;
				kwotaNetto = 231.74;
				stawkaVAT = 0.22;
				podatekVAT = kwotaNetto * stawkaVAT;
				kwotaBrutto = kwotaNetto + podatekVAT;
				System.out.println(nazwaOperacji);
				System.out.println("-------------------------------");
				System.out.println("Kwota netto = " + kwotaNetto);
				System.out.println("Stawka VAT = " + stawkaVAT*100 + "%");
				System.out.println("Podatek VAT = " + podatekVAT);
				System.out.println("Kwota brutto = " + kwotaBrutto);
			}
}