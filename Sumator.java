import java.util.Scanner;
public class Sumator
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double suma=0;
		double wprowadzonaLiczba=0;
		
		
		do
		{
			System.out.println("Wprowadz liczbe do zsumowania (nacisniecie \'0\' spowoduje zakonczenie programu)");
			wprowadzonaLiczba = sc.nextDouble();
			suma += wprowadzonaLiczba;
			

		}
		while (wprowadzonaLiczba!=0);
		
			System.out.print("Suma wprowadzonych liczb to: " + suma);
	
		
		
	}
}