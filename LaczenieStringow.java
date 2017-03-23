import java.util.Arrays;

public class LaczenieStringow
{
	public static void main (String[] args)
	{
		String pierwszyNapis = "To jest napis numer jeden ";
		String drugiNapis = "To jest napis numer dwa";
		
		String polaczoneNapisy = pierwszyNapis.concat(drugiNapis);
		
		System.out.println("Pierwszy napis: " + pierwszyNapis); 
		System.out.println("Drugi  napis: " + drugiNapis); 
		System.out.println("Polaczone napisy: " + polaczoneNapisy); 
		
		int[] tabliczka = {7,1,8,3,0};
		
		System.out.println(tabliczka.length);
		
		Arrays.sort(tabliczka);
		
		for (int i=0; i<tabliczka.length; i++)
		{
			System.out.println(tabliczka[i] + " ");
		}
	}
}