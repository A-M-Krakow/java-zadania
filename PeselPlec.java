import java.util.Scanner;
public class PeselPlec
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj numer PESEL");
		String pesel = sc.nextLine();
		if ((pesel.charAt(9)%2==0)) System.out.println("Kobieta");
		else System.out.println ("Mezczyzna");
		
	}
}