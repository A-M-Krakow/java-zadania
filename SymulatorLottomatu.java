import java.util.Scanner;
import java.util.Arrays;

public class SymulatorLottomatu
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Wprowadz ilosc losowan (od 1 do 8): ");
		int iloscLosowan = sc.nextInt();
		
		
		if (iloscLosowan>0 && iloscLosowan<9)
		{
			System.out.printf("%n%20s%n", "ZAKLADY DUZEGO LOTKA");
			System.out.printf("%20s%n", "====================");
			for (int numerLosowania=1; numerLosowania<=iloscLosowan; numerLosowania++)
			{
				int[] losowanie = new int[6];
				
				
				
				for (int wylosowana=0; wylosowana<losowanie.length; wylosowana++)
				{
					losowanie[wylosowana] = (int)(Math.random()*(48+1) + 1);
					if ((wylosowana>0) && (losowanie[wylosowana] == losowanie[wylosowana-1])) wylosowana--;
					Arrays.sort(losowanie);
						
				}
			
			
			
				System.out.printf("%d/", numerLosowania);
				for (int wylosowana=0; wylosowana<losowanie.length; wylosowana++)
				{
					System.out.printf("%3d", losowanie[wylosowana]);
				}
				System.out.printf("%n");
				
			}
			
			
			
			
			
		}

		else System.out.println("Zla ilosc losowan!");		
	}
}