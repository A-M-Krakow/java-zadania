import java.util.Scanner;
public class DlugoscNapisow
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Wpisz pierwszy napis: ");
		String pierwszy = sc.nextLine();
		System.out.println("Wpisz drugi napis: ");
		String drugi = sc.nextLine();
		System.out.println("Dluzszy napis to: ");
		if (pierwszy.length() < drugi.length()) System.out.println(drugi);
		else  System.out.println(pierwszy);
	}
}