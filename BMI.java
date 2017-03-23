import java.util.Scanner;
public class BMI
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Podaj swoj wzrost w metrach: ");
		double wzrost = sc.nextDouble();
		System.out.print("Podaj swoja wage w kilogramach: ");
		double waga = sc.nextDouble();
		double BMI = waga/(wzrost*wzrost);
		System.out.println("Twoje BMI to: " + BMI);
		
		if (BMI>=40) System.out.println ("otylosc skrajna");
		if (BMI<40 && BMI >= 35) System.out.println ("otylosc kliniczna");
		if (BMI<35 && BMI > 30) System.out.println ("I stopien otylosci");
		if (BMI<30 && BMI > 25) System.out.println ("nadwaga");
		if (BMI<25 && BMI > 18.5) System.out.println ("wartosc prawidlowa");
		if (BMI<18.5 && BMI > 17) System.out.println ("niedowaga");
		if (BMI<17 && BMI > 16) System.out.println ("wychudzenie");
		if (BMI<16) System.out.println ("wyglodzenie");

	}
}