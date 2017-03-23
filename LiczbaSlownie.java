import java.util.Scanner;
public class LiczbaSlownie
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Wpisz jakas liczbe: ");
		String liczba = sc.nextLine();
		System.out.print(liczba + " - ");
		for (int i = 0; i<liczba.length(); i++)
		{
			if (!Character.isDigit(liczba.charAt(i))) 
			{
				System.out.print ("Niepoprawna liczba!");
				break;
			}
			switch (liczba.charAt(i))
			{
				case '0': System.out.print ("zero "); break;
				case '1': System.out.print ("jeden "); break;
				case '2': System.out.print ("dwa "); break;
				case '3': System.out.print ("trzy "); break;
				case '4': System.out.print ("cztery "); break;
				case '5': System.out.print ("piec "); break;
				case '6': System.out.print ("szesc "); break;
				case '7': System.out.print ("siedem "); break;
				case '8': System.out.print ("osiem "); break;
				case '9': System.out.print ("dziewiec "); break;
				default: System.out.print ("Niepoprawna liczba!");
				
			}
			
		}
	}
}