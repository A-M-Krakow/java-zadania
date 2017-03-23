import java.util.Scanner;
public class ZadanieDrugie
{
	static void posortujStringi()
	{
		Scanner sc = new Scanner (System.in);
		String[] lancuchy = new String[10];
		
		for (int i = 0; i<10; i++)
		{
			System.out.print("Podaj lancuch tekstowy: ");
			lancuchy[i] = sc.nextLine();
		}
		
		for (int i = 0; i<10; i++)
		{
			for (int j=0; j<10-i-1; j++)
			{
				if (lancuchy[j].length() < lancuchy[j+1].length())
				{
					String bufor = lancuchy[j];
					lancuchy[j] = lancuchy[j+1];
					lancuchy[j+1]=bufor;
				}
			}
		}
		
		
		for (String lancuch : lancuchy)
		{
			System.out.println("Lancuch: " + lancuch + " (dlugosc: " + lancuch.length() + ")");
		}
		
		
		
	}
	
	
	public static void main (String[] args)
	{
		posortujStringi();
	}
}