public class AlternatywnaTabliczkaMnozenia
{
	public static void main (String[] args)
	{

		int i = 1;
		while (i<=12) 
		{
			int j = i;
			while (j<=12*i)
			{
				System.out.printf("%-4d", j);
				j+=i;
			}
			System.out.printf("\n");
			i++;
		}
		
		
	}
	
	
	
}