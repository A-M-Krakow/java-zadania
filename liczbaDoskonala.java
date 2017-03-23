import java.util.Scanner;
public class liczbaDoskonala
{
	
	static boolean czyDoskonala(int liczba)
	{
		int sumaDzielnikow=1;
		for (int i=2; i<liczba; i++)
		{ 
			if ((liczba%i)==0) sumaDzielnikow+=i;
		}
		if (sumaDzielnikow==liczba) return true;
		else return false;
	}
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Podaj liczbe!: ");
		int liczba = sc.nextInt();
		System.out.print("Liczba " + liczba + " jest ");
		if (czyDoskonala(liczba)==true) System.out.print("doskonala!");
		else System.out.print("niedoskonala!");
	}
}