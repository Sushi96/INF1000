import java.util.*;
class Rekkefolge {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		//E.1 A)
		//Leser inn 3 tall
		System.out.print("Skriv tall nr. 1: ");
		int tall1 = Integer.parseInt(in.nextLine());
		System.out.print("Skriv tall nr. 2: ");
		int tall2 = Integer.parseInt(in.nextLine());
		System.out.print("Skriv tall nr. 3: ");
		int tall3 = Integer.parseInt(in.nextLine());

		//E.1 B)

		if (tall1 < tall2 && tall2 < tall3) {
			//Stigende
			System.out.println("Stigende.");
		} else if (tall1 > tall2 && tall2 > tall3) {
			//Synkende
			System.out.println("Synkende.");
		} else {
			//Ingen
			System.out.println("Ingen.");
		}
	}
}