/* Min Oppgave 3
	* Dette programmet gjør det mulig og enkelt notere og sortere tider
	* til alle på friidretslaget som løper feks 60 meteren.
	* En meny med tre valg: 
	* 1. Notere ny tid
	* 2. Vise alle tider 
	* 3. Avslutte programmet
*/

import java.util.*;

public class MinOppgave3 {
	public static void main(String [] args ){

		Scanner in = new Scanner(System.in);
		int valg = 4;
		int teller = 0;
		double[] ResultatListe = new double[100];
		String[] ResultatNavn = new String[100];

		while (valg != 0) {
			//Skriver ut meny
			System.out.println("PROGRAM FOR A NOTERE TIDER");
			System.out.println("1: Noter ny tid.");
			System.out.println("2: Vis alle tider.");
			System.out.println("3: Avslutt.");
			System.out.print("Ditt valg: ");
			String input = in.nextLine();
			valg = Integer.parseInt(input);

			if (valg == 1) {
				//Sett inn tid
				System.out.print("Navn på løper: ");
				String navn = in.nextLine();
				System.out.print("Tid: ");
				input = in.nextLine();
				double t = Double.parseDouble(input);
				ResultatListe[teller] = t;
				ResultatNavn[teller] = navn;

				teller++;
				valg = 4;
			} else if (valg == 2){
				//Print tider
				System.out.println("TIDER:");
				//Arrays.sort(ResultatListe);   Roter til relasjonen mellom navn og tid
				for (int p=0; p < ResultatNavn.length; p++) {
					if (ResultatNavn[p] != null) {
						System.out.print(ResultatNavn[p] + ": ");
						System.out.println(ResultatListe[p] + "sekunder.");
					}
					}
				System.out.print("Trykk enter for a komme tilbake...");
				String pause = in.nextLine();
				valg = 4;
			}else if (valg == 3){
				//Avslutt program

				valg = 0;
			}else {
				//Gå tilbake til meny
				valg = 4;
			}
		}
	}
}