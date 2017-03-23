/* KopiowanieTablicy
 * 
 * UEK 2015 */
 
 public class KopiowanieTablicy 
 {
	 public static void main (String[] args)
	 {
		 int mojaTablica[] = {5,333,1,7, 1500, 56465};
		 int drugaTablica[] = new int[mojaTablica.length];
		 
		  System.out.print("Tablica wyglada tak: ");
		 for (int i=0; i<mojaTablica.length; i++)
		 {
			 System.out.print("[" + mojaTablica[i] + "] " );
		 }
		 
		 
		 System.arraycopy(mojaTablica, 0, drugaTablica, 0, mojaTablica.length);
		 
		 
		 System.out.print("\nKopia tablicy wyglada tak: ");
		 for (int i=0; i<mojaTablica.length; i++)
		 {
			 System.out.print("[" + drugaTablica[i] + "] " );
		 }
		 
	 }
 }