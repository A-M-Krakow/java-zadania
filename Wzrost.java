import java.util.Scanner;
public class Wzrost
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Podaj wzrost w centymetrach: ");
		double wzrostCm = sc.nextDouble();
		double wzrostStopy = wzrostCm/30.48;
		double wzrostCale =  wzrostCm/2.54;
		
		System.out.println("wzrost w centymetrach: " + wzrostCm );
		System.out.println("wzrost w stopach: " + wzrostStopy );
		System.out.println("wzrost w calach: " + wzrostCale );	
	}
}