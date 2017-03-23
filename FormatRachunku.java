import java.util.Scanner;
public class FormatRachunku
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj numer rachunku: ");
		String numer = sc.nextLine();
		System.out.println("Twoj numer rachunku to: " + numer.substring(0,2) + " " + numer.substring(2,6) + " " + numer.substring(6,10) + " " + numer.substring(10,14) + " " + numer.substring(14,18) + " " + numer.substring(18,22) + " " + numer.substring(22,26));
	}
}