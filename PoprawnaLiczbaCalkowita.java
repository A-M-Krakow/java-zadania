import java.util.Scanner;
public class PoprawnaLiczbaCalkowita 
{
	public static void main (String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Podaj liczbe: ");
			String liczba = sc.nextLine();
			boolean poprawna = true;
			
			if (!(Character.isDigit(liczba.charAt(0))) && !(liczba.charAt(0) == '-') )
			{
				poprawna = false;
			}	
			else 
			{
				for (int i=1; i<liczba.length(); i++)
				{
					if (!Character.isDigit(liczba.charAt(i))) poprawna = false;
				}
			}
			
			if (poprawna)
			{
				System.out.println("Poprawna!");
			}
			else{
				System.out.println("Niepoprawna");
			}
		}
}