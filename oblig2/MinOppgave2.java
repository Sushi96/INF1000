/** OPPGAVE 2.5 - MinOppgave2.java
 * Tema: Egen oppgave
 *
 * Lag egen oppgave som handler om metoder.
 * Både oppgaveteksten og besvarelsen skal
 * leveres inn.

 * Dette er et program for kollektivreiser.
 * Det velges antall soner og alder, og deretter kalkuleres pris.
 * Det er 50% under 18 år og over 60 år.
 * Èn sone koster 40, med et tillegg på 20kr for en ekstra.
 * Reiser over to soner må kjøpes i skranken.
 */

//Importerer scanner
import java.util.Scanner;

public class MinOppgave2 {

	//Metode for rabatert gruppe
	public static void rabattBillett(int soner){
		System.out.println("Du kvalifiserer til rabatt billett.");
		int sone1 = 40;
		int sone2 = 20;

		if (soner == 1){
			System.out.println("Billetten koster " + (sone1/2) + "kr.");

		} else if(soner == 2) {
			System.out.println("Billetten koster " + ((sone1 + sone2)/2) + "kr.");

		}else{
			System.out.println("Kontakt skranken for kjop av billett.");
		}
	}

	//Metode for fullpris
	public static void sonePris(int soner){
		int sone1 = 40;
		int sone2 = 20;

		if (soner == 1){
			System.out.println("Billetten koster " + sone1 + "kr.");

		} else if(soner == 2) {
			System.out.println("Billetten koster " + (sone1 + sone2) + "kr.");

		}else{
			System.out.println("Kontakt skranken for kjop av billett.");
		}
	}

    public static void main(String [] args) {
	Scanner in = new Scanner(System.in);

	//Input
	System.out.print("Hvor mange soner onsker du aa reise? ");
	String antallSoner = in.nextLine();
	System.out.print("Hvor gammel er du? ");
	String aar = in.nextLine();

	//Parser input
	int soner = Integer.parseInt(antallSoner);
	int alder = Integer.parseInt(aar);

	//Kaller metoder baser på alder
	if (alder >= 18 && alder <= 60){
		sonePris(soner);
	}else {
		rabattBillett(soner);
	}


    }
}
