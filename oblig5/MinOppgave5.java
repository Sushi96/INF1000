/* Min Oppgave 5

	* Dette programmet gjør det mulig og enkelt notere og sortere tider
	* til alle på friidretslaget som løper feks 60 meteren.
	* En meny med tre valg: 
	* 1. Notere ny tid
	* 2. Vise alle tider 
	* 3. Avslutte programmet

	Krav: bruk klasser og objekter
	
	Laget basert på tilbakemeldinger fra oblig 3, MinOppgave3

	Du kunne løst dette mye mer elegant ved å bruke objekter.
	Du kunne feks lagd deg Person-objekter, der hvert Person-objekt
	hadde en tid knyttet til seg? Så kunne du ha sortert personene etter
	tiden de brukte.

*/
import java.util.*;

public class MinOppgave5 {
	public static void main(String [] args ){
		Scanner scan = new Scanner(System.in);
		int valg = -1;

		int tabellPlasser = 10;
		Person[] tabell = new Person[tabellPlasser];
		int personInTabell = 0;

		//Meny
		while (valg != 0) {
			skrivMeny();
			valg = Integer.parseInt(scan.nextLine());
			//Sett inn tid
			if (valg == 1) {
				nyTid(tabell, personInTabell, tabellPlasser);
				personInTabell++;		}
			//Print tider
			else if (valg == 2) {
				printTabell(tabell, tabellPlasser);
			}
			//Avslutt
			else if (valg == 3) {
				valg = 0;
			}
			//Ugyldig valg
			else {
				System.out.println("Ugyldig valg.");
			}
		}
	}
	//Skriver meny
	static void skrivMeny() {
		//Skriver ut meny
		System.out.println("PROGRAM FOR A NOTERE TIDER");
		System.out.println("1: Noter ny tid.");
		System.out.println("2: Vis alle tider.");
		System.out.println("3: Avslutt.");
		System.out.print("Gi et valg: ");
	}
	//Noterer ny tid
	static Person[] nyTid(Person[] tabell, int personInTabell, int tabellPlasser) {
		if (personInTabell != tabellPlasser) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Navnet ditt: ");
			String navn = scan.nextLine();
			System.out.print("Tiden din: ");
			double tid = Double.parseDouble(scan.nextLine());

			tabell[personInTabell] = new Person();
			tabell[personInTabell].setNavn(navn);
			tabell[personInTabell].setTid(tid);

			return tabell;
		} else {
			System.out.println("Tabellen er full!");
			return tabell;
		}
	}
	//Printer tabell
	static void printTabell(Person[] tabell, int tabellPlasser) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < tabellPlasser; i++) {
			if (tabell[i] != null) {
				System.out.println(tabell[i].getNavn() + " Tid: " + tabell[i].getTid());
			}
		}
		System.out.print("Trykk enter...");
		scan.nextLine();
	}
}

class Person {
	private String navn;
	private double tid;

	//Constructor
	public Person() {
		navn = "Ukjent";
		tid = 0.0;

	}
	//Setter navn
	public void setNavn(String navn) {
		this.navn = navn;
	}
	//Setter tid
	public void setTid(double tid) {
		this.tid = tid;
	}
	//Henter navn
	public String getNavn() {
		return this.navn;
	}
	//Henter tid
	public double getTid() {
		return this.tid;
	}

}