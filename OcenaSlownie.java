import java.util.Scanner;
public class OcenaSlownie
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Podaj ocene (liczba naturalna od 1 do 6): ");
		int ocena = sc.nextInt();
		
		switch (ocena)
		{
			case 1:
				System.out.print("niedostateczny");
				break;
			case 2:
				System.out.print("dopuszczajacy");
				break;
			case 3:
				System.out.print("dostateczny");
				break;
			case 4:
				System.out.print("dobry");
				break;
			case 5:
				System.out.print("bardzo dobry");
				break;
			case 6:
				System.out.print("celujacy");
				break;
			default:
				System.out.print("nie ma takiej oceny");
		}
	}
}