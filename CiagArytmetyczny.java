import java.util.Scanner;
public class CiagArytmetyczny 
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Ile wyrazow ciagu arytmetycznego o roznicy 3 wyswietlic?: ");
		int n = sc.nextInt();
		int wyraz = 1;
		System.out.print("Ciag arytmetyczny o roznicy 3: ");
		while (n>0)	
		{
			System.out.print(wyraz + " ");
			wyraz = wyraz + 3;
			n--;
		}
	
}
}