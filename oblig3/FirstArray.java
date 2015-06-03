import java.util.Scanner;

public class FirstArray {
	public static void main (String [] args) {

		//Oppg 3.3 A)
		int[] MineTall = {0,1,2,3};

		//Oppg 3.3 B)
		int[] ArrayB = new int[4];
		int tallInn = 0;

		for (int b = 0; b < 4; b++) {
			ArrayB[b] = tallInn;
			tallInn++;
		}

		//Oppg 3.3 C)
		ArrayB[0] = 1337;
		ArrayB[3] = 1337;

		//Oppg 3.3 D)
		Scanner in = new Scanner(System.in);

		String[] navnListe = new String[5];

		for (int i = 0; i<5 ; i++) {
			System.out.print("Skriv inn navn " + (i + 1) + " av 5: ");
			String navn = in.nextLine();
			navnListe[i] = navn;
		}
	}
}