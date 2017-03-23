import java.util.Scanner;
public class ProstyKalkulator
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);

		
		
		
		System.out.print("Wprowadz argument 1: ");
		double argument1 = sc.nextDouble();
		System.out.print("Wprowadz argument 2: ");
		double argument2 = sc.nextDouble();
		
		
		System.out.print("Wprowadz dzialanie: "); 
			sc.nextLine();
			String dzialanie = sc.nextLine();
		
	
		
		switch (dzialanie)
		{
			case "+": 
				System.out.println(argument1 + " + "+ argument2 + " = " + (argument1+argument2));
				break;
			case "-": 
				System.out.println(argument1 + " - "+ argument2 + " = " + (argument1-argument2));
				break;
			case "*": 
					System.out.println(argument1 + " * "+ argument2 + " = " + (argument1*argument2));
				break;
			case "/": 
					System.out.println(argument1 + " / "+ argument2 + " = " + (argument1/argument2));
				break;
			default: System.out.println("nieprawidlowy operator");
				
			
		}
	}
}