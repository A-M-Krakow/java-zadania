import java.util.Scanner;
public class WeryfikacjaPeselMetoda
{
	static boolean sprawdzPesel (String pesel)
	{
		boolean poprawnoscPeselu = false;
		if (pesel.length()==11)
		{
			int suma = 0;
			int[] tablicaPesel = new int[11]; 
			int cyfraKontrolna;
			
			for (int i=0; i<10; i++)
			{
				if (Character.isDigit(pesel.charAt(i)))
				{
					tablicaPesel[i] = pesel.charAt(i)-48;		
					if (i==1||i==5||i==9)
					{
						tablicaPesel[i]*=3;
					}
					if (i==2||i==6)
					{
						tablicaPesel[i]*=7;
					}
					if (i==3||i==7)
					{
						tablicaPesel[i]*=9;
					}	
					suma+=tablicaPesel[i];
				}
			}
			tablicaPesel[10] = pesel.charAt(10)-48;
			if (suma%10 != 0) cyfraKontrolna = 10-(suma%10);
			else cyfraKontrolna = 0;
			
			if (cyfraKontrolna == tablicaPesel[10]) poprawnoscPeselu = true;
		}
		return poprawnoscPeselu;
	}
	
	
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Wprowadz PESEL: ");
		String pesel = sc.nextLine();
		
		
		if (sprawdzPesel(pesel)) 
		{
			System.out.println("Pesel poprawny!");
		}
		else System.out.println("Pesel NIEPOPRAWNY!");
	}
}