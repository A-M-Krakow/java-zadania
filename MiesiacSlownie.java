import java.util.Scanner;
public class MiesiacSlownie
{
	static String podajMiesiac (int miesiac)
	{
		String nazwaMiesiaca;
		switch (miesiac)
		{
			case 1: 
					nazwaMiesiaca =  "Styczen"; 
					break;
			case 2: 
					nazwaMiesiaca =  "Luty"; 
					break;
			case 3: 
					nazwaMiesiaca =  "Marzec"; 
					break;
			case 4: 
					nazwaMiesiaca =  "Kwiecien"; 
					break;
			case 5: 
					nazwaMiesiaca =  "Maj"; 
					break;
			case 6: 
					nazwaMiesiaca =  "Czerwiec"; 
					break;
			case 7: 
					nazwaMiesiaca =  "Lipiec"; 
					break;
			case 8: 
					nazwaMiesiaca =  "Sierpien"; 
					break;
			case 9: 
					nazwaMiesiaca =  "Wrzesien"; 
					break;
			case 10: 
					nazwaMiesiaca =  "Pazdziernik"; 
					break;
			case 11: 
					nazwaMiesiaca =  "Listopad"; 
					break;
			case 12: 
					nazwaMiesiaca =  "Grudzien"; 
					break;
			default: 
					nazwaMiesiaca =  "Nie ma takiego miesiaca!";
		}
		return nazwaMiesiaca;
	}
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Podaj numer miesiaca: ");
		int miesiac = sc.nextInt();
		String nazwaMiesiaca = podajMiesiac(miesiac);
		System.out.println("Nazwa miesiaca to: " + nazwaMiesiaca);
	}
}
