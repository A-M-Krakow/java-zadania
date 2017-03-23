public class Operatory 
{
	public static void main(String[] args)
	{
		int a = 5;
		int b = 2;
		System.out.println("a = " + a + ", b = " + b);							// a = 5, b = 2
		System.out.println("a/b = " + (a/b) );									// a/b = 2
		System.out.println("a!=b = " + (a!=b) );								// a!=b = true
		System.out.println("a%b > --b ? -3 : 17 = " + (a%b > --b ? -3 : 17) );	// a%b > --b ? -3 : 17 =  17
		System.out.println("++b-a = " + (++b-a) );								// ++b-a = -3
		System.out.println("a/(float)b == a/b = " + (a/(float)b == a/b) );		// a/(float)b == a/b = false
	}
}