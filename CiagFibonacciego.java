import java.util.Scanner;
public class CiagFibonacciego
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Ile wyrazow ciagu Fibonacciego wyswietlic?: ");
		int iloscZnakow = sc.nextInt();
		
		long[] ciagFibo = new long[iloscZnakow];
		
		for (int wyraz=0; wyraz<ciagFibo.length; wyraz++)
		{	
			switch (wyraz)
			{
				case 0: ciagFibo[wyraz]=0;
						break;
				case 1: ciagFibo[wyraz]=1;
						break;
				default: ciagFibo[wyraz]=(ciagFibo[wyraz-2]+ciagFibo[wyraz-1]);
			}
			System.out.print("\t" + ciagFibo[wyraz]);
		}
	}
}
