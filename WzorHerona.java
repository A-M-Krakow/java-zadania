import java.util.Scanner;
public class WzorHerona
{
	static double obliczPoleTrojkata (double a, double b, double c)
	{
		double p = (a+b+c)/2;
		double pole = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return pole;
	}
	public static void main (String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Podaj dlugosc boku a: ");
			double a = sc.nextDouble();
			System.out.println("Podaj dlugosc boku b: ");
			double b = sc.nextDouble();
			System.out.println("Podaj dlugosc boku c: ");
			double c = sc.nextDouble();
			
			if ((a+b)>c && (a+c)>b && (b+c)>a && a>0 && b>0 && c>0) System.out.println(obliczPoleTrojkata(a,b,c));
			else System.out.println("Zle wymiary bokow trojkata!");
		}
}