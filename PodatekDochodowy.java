import java.util.Scanner;
public class PodatekDochodowy
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		final double PODSTAWA = 85528;
		System.out.println("Podaj osiagniete dochody");
		double dochody = sc.nextDouble();
		double podatek;
		
		if (dochody<=PODSTAWA) podatek = dochody*0.18-556.02;
		else podatek = 14839.02 + (dochody - PODSTAWA)*0.32;
		
		if (podatek < 0) podatek = 0;
		System.out.println("Podatek do zaplacenia wynosi: " + podatek + "zl");
	}
}