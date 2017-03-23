import java.text.MessageFormat;
import java.util.Date;
import java.util.Formatter;

public class FormatowanieAlternatywne
{
	public static void main(String[] args)
	{
		String s;
		Date teraz = new Date();
		String miejsce = "Krakow";
		int mila = 1852;
		double vat = 0.22;
		double cena = 31560.76;
		
		System.out.println(teraz);
		
		 Formatter formatter = new Formatter();
		 
		
		 
		 System.out.println(formatter.format(miejsce + ",%1$tF," + " godz. %1$tR", teraz));
		
		 System.out.println(formatter.format("%1$skB to %2$sB", 256, 256*1024 ));

		
		
		
	}
}