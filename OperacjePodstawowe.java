public class OperacjePodstawowe 
{
	public static void main (String[] args)
		{
			int i = 7;
			System.out.println("Powiesc \"Wojna i pokoj\" Lwa Tolstoja");		// Zastosowanie "\" aby wyświetlić cudzysłów
			System.out.println("64kB to " + 0xFFFF + " bitow");					// zastosowanie 0x dla oznaczenia liczby w systemie szesnastkowym
			System.out.println("Czy 32 > 15 ? " + (32>15 ? "tak" : "nie") );	// sprawdzanie, czy 32<15 i wyświetlenie tak lub nie
			System.out.println("\\u0042 (unicode) reprezentuje znak \u0042");	// przedrostek w "\u0042" powoduje wyswietlenie znaku ukrytego pod kodem unicode 0042
			System.out.println("7 * (2 do potegi 3) = " + (7 << 3) );			// dopisujemy 3 zera do binarnej reprezentacji siódemki przesunięcie 111 o 3 miejsca w lew = 111000
			System.out.println("Czesc calkowita 2.56 wynosi " + (int) 2.56);	// wymuszenie konwersju typu na integer
			System.out.println("7/2 = " + 7/2 + ", ale dlaczego?");				// wynik działania na dwóch liczbach typu int daje liczbętypu int
			System.out.println("A dlaczego 7/2d = " + 7/2d + " ?");				// jednym ze składników jest liczba typu double, więc wynik teżjest double
			System.out.println("Reszta z dzielenia 10/6 = " + 10%6);			// dzielenie modulo %
			System.out.println("Wartosc i=" + i + ", a ++i=" + (++i));			// ++i oznacza zwiększenie i o jeden przed wyświetleniem wyniku
			System.out.println("Gdy teraz wykonamy operacje i*=9 to i=" + (i*=9));	// po wcześniejszym działaniu nasze i wynisi 8, a pomnożone przez 9 daje 72 
		}
}