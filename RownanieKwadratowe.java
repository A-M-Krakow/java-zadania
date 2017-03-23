import java.util.Scanner;
import java.lang.Math;
public class RownanieKwadratowe
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Podaj a: ");
		double a = sc.nextDouble();
		System.out.print("Podaj b: ");
		double b = sc.nextDouble();
		System.out.print("Podaj c: ");
		double c = sc.nextDouble();
		double delta = b*b-4*a*c;
		
		
		if (delta<0) System.out.println("Rownanie nie ma rozwiazan!");
		else if (delta == 0) 
			{
				System.out.println ("x = " + (-b/(2*a)));
			}
			else
			{
				double pierwiastekZDelty = Math.sqrt(delta);
				System.out.println ("x1 = " + -((b-pierwiastekZDelty)/(2*a)) + "\nx2 = " + -((b+pierwiastekZDelty)/(2*a)));
			}
				
	}
}