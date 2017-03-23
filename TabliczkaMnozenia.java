public class TabliczkaMnozenia
{
	public static void main (String[] args)
	{

		for (int i = 1; i<=12; i++)
		{
			for (int j = i; j<=12*i; j+=i )
			{
				System.out.printf("%-4d", j);
			}
			System.out.printf("\n");
		}
	}
}