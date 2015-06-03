/**
* Personer som eier og leier DVDer
* oblig. 7
*
* @author Marius Christensen
* @version 1.0
*/

import java.util.*; //ArrayList, PrintWriter, Scanner, HashMap

public class Person {

	//Variabler
	private String navn;
	HashMap<String, Dvd> dvdSamling = new  HashMap<String, Dvd>();
	private int utleid = 0;
	private int laant = 0;

	/**
	 * Konstruktør
	 */
	Person(String navn) {
		this.navn = navn;
	}

	/**
	 * toString, returerer navn
	 * @return navn
	 */
	public String toString() {
		return navn;
	}

	/**
	 * Setter en mer uleid
	 */
	void addUtleid() {
		laant++;
	}

	/**
	 * Setter en mindre uleid
	 */
	void minusUtleid() {
		laant--;
	}

	/**
	 * Låner ut DVDen
	 * @param  tittel   Tittel på DVDen
	 * @param  leier navnet på leier
	 */
	void nyDvd(String tittel, String eier) {
		dvdSamling.put(tittel, new Dvd(tittel, eier));
	}

	/**
	 * Låner ut DVDen
	 * @param  tittel   Tittel på DVDen
	 * @param  leier navnet på leier
	 */
	void settUtlaan(String tittel, String leier) {
		if (dvdSamling.get(tittel).ledig()) {
			dvdSamling.get(tittel).settLeier(leier);
			utleid++;
		}
	}

	/**
	 * Sjekker om DVDen er ledig
	 * @param  navn   Navn på personen
	 * @param  tittel Tittel paa filmen
	 * @return        boolean
	 */
	boolean ledig(String tittel) {
		return dvdSamling.get(tittel).ledig();

	}

	/**
	 * Sjekker om leier er lik
	 * @param  leier   Navn på leier
	 * @param  tittel Tittel paa filmen
	 * @return        boolean
	 */
	boolean sjekkOmUtleidTil(String leier, String tittel) {
		if (dvdSamling.get(tittel).erLeierSamme(leier)) {
			return true; 
		} else {
			return false;
		}
	}

	/**
	 * Sjekker om personen eter dvd fra før
	 * @param  tittel Tar tittel å sjekke
	 * @return        boolean
	 */
	boolean eierDvd(String tittel) {
		return dvdSamling.containsKey(tittel);

	}

	/**
	 * Fjerner DVDens leier
	 * @param  tittel Tar tittel å fjerne
	 */
	void leieSettLedig(String tittel) {
		dvdSamling.get(tittel).settLedig();
		utleid--;
	}

	/**
	 * Sjekker om HashMapet med dvdSamling er tomt
	 * @return boolean
	 */
	private boolean erTomt() {
		return dvdSamling.isEmpty();
	}

	/**
	 * Finner størrelsen på DVD samlingen til personen
	 * @return int antall
	 */
	int antallDvd() {
		return dvdSamling.size();
	}

	/**
	 * Antall lånte DVDer
	 * @return int antall
	 */
	int antallLaant() {
		return utleid;
	}

	/**
	 * Antall utleide DVDer
	 * @return int antall
	 */
	int antallUtleid() {
		return laant;
	}

}