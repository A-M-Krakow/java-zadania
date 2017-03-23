import java.util.Scanner;
public class Silnia
{
	public static void main (String[] args)
	{
		Scanner wprowadzanie = new Scanner(System.in);
		System.out.print("Podaj N: ");
		int n = wprowadzanie.nextInt();
		int wynik = 1;
		
		if (n>=0)
		{
			for (int i=1; i<=n; i++)
			{
				wynik *=i;
			}
		System.out.println(n + "! = " + wynik);
		}
		else System.out.println("Wprowadziles ujemna liczbe :(");
		
		
	}
}