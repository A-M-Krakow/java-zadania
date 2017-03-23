import java.util.Scanner;
public class PismoRozstrzelone
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Wpisz cos: ");
		String cos = sc.nextLine();
		System.out.print("Cos: " + cos);
		System.out.print("Cos rozstrzelone: ");
		for (int znak = 0; znak < cos.length(); znak++)
		{
			System.out.print(cos.charAt(znak) + " ");
		}
	}
}
