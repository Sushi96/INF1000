public class Forlokker {
	public static void main (String [] args) {

		int b = 0;
		int c = 0;
		//oppg 3.2 A)
		for (int t = 0; t<10; t++) {

			//Printer hvis partall
			if ((t % 2) == 0) {
				System.out.println("Partall: " + t);
				b = b+ t;
			}

			//Oppg 3.2 C
			if ((t %2) != 0) {
				c = c + t;
				//System.out.print("Oddetall: " + t);
			}
		}
		System.out.println("Summen av alle partallene mellom 1-10 er: " + b);
		System.out.println("Summen av alle oddetallene mellom 1-10 er: " + c);
	}
}