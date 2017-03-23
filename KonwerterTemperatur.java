import java.util.Scanner;
public class KonwerterTemperatur
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Podaj temperature w stopniach Celsjusza: ");
		double celsjusz = sc.nextDouble();
		double fahrenheit = ((celsjusz*9/5)+32);
		double kelwin = (celsjusz+273.15);
		
		
		System.out.println("Skala Celsjusza: " + celsjusz);
		System.out.println("Skala Fahrenheita: " + fahrenheit);
		System.out.println("Skala Kelwina: " + kelwin);
	}
}