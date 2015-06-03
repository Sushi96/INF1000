import java.io.*;
import java.util.*;

public class Ordliste {
	//Variabler
	private ArrayList<Ord> ol = new ArrayList<Ord>();
	private int antallOrd;
	private Ord[] vanligeOrd = new Ord[5];

	//Konstruktør
	public Ordliste() {
		antallOrd = 0;
	}

	public String toString() {
		String navn = ol.get(1) + "";
		int forekomst = ol.get(1).hentAntall();

		return "Ord: " + navn + " " + forekomst;
	}

	//Grensesnitt
	void lesBok(String filnavn) throws Exception {
		File fil = new File(filnavn);
		Scanner innFil = new Scanner(fil);

		while (innFil.hasNextLine()) {
			String linje = innFil.nextLine();
			leggTilOrd(linje);
		}
	}
	void leggTilOrd(String s) {
		if ( finnOrd(s) != null) {
			//Ordet finnes fra før; oek antall i objekt ord med 1
			for (int i = 0; i < antallOrd(); i++) {
				if ( ol.get(i).toString().equalsIgnoreCase(s) ) {
					//Finner plassen i arrayen
					int p = arraySok(s);
					//Legger til 1 til ordobjektet med den indexen
					ol.get(i).oekAntall();
				}
			}

		} else {
			//Ordet finnes ikke fra før; opprett ord
			Ord tempOrd = new Ord(s);
			ol.add(tempOrd);
		}
	}

	Ord finnOrd(String s) {
		for (int i = 0; i < antallOrd(); i++) {
			if ( ol.get(i).toString().equalsIgnoreCase(s) ) {
				return ol.get(i);
			}
		}
		return null;
	}

	private int arraySok(String s) {
		int index = 0;

		for (int i = 0; i < antallOrd(); i++) {
			if ( ol.get(i).toString().equalsIgnoreCase(s) ) {
				index = i;
			}
		}
		return index;
	}

	int antallOrd() {
		antallOrd = ol.size();
		return antallOrd;
	}

	int antallForekomster(String s) {
		int i = arraySok(s);
		int forekomstAntall = ol.get(i).hentAntall();
		return forekomstAntall;
	}

	Ord vanligste() {
		int tall = 0;
		Ord hoyestTall = null;

		for (int i=0; i < antallOrd(); i++) {
			if (ol.get(i).hentAntall() >= tall ) {
				tall = ol.get(i).hentAntall();
				hoyestTall = ol.get(i);
			}
		}
		if (hoyestTall == null) {
			return null;
		} else {
			return hoyestTall;
		}
	}

	//Frivillig
	Ord[] alleVanligtse() {
		//Bruker arrayen vanligeOrd[5]
		//finner det eller de ordene som forekommer flest ganger i boken.
		return null;
	}
}