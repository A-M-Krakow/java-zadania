import java.util.Scanner;
public class ZdanieWspak 
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Wpisz jakies zdanie: ");
		String zdanie = sc.nextLine();
		String noweZdanie = "";
		for (int i = zdanie.length()-1; i>=0; i--)
		{
			noweZdanie+=zdanie.charAt(i);
		}
		
		System.out.print("Zdanie wspak to: " + noweZdanie);
	}
}