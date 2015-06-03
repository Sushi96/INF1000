/**
* DVDer som eies og leies av personer
* oblig. 7
*
* @author Marius Christensen
* @version 1.0
*/

public class Dvd {

	//Variabler
	private String tittel;
	private String eier;
	private String leier;
	
	/**
	 * Konstruktør
	 */
	Dvd(String tittel, String eier) {
		this.tittel = tittel;
		this.eier = eier;
		this.leier = null;
	}
	
	/**
	 * toString, returerer tittel + laane, hvis finnes
	 * @return tittel
	 */
	public String toString() {
		if (leier != null) {
			return tittel + " (laant av " + leier + ")";
		}else {
			return tittel;
		}
	}

	/**
	 * Henter tittel på DVDen
	 * @return boolean tittel
	 */
	boolean erLeierSamme(String leier) {
		if (this.leier != null ) {
			if (this.leier.equalsIgnoreCase(leier)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
		
	}

	/**
	 * Henter leier av DVDen
	 * @return String navn
	 */
	String hentLeier() {
		return leier;
	}

	/**
	 * True hvis leier er null
	 * @param  leie navnet på leier
	 * @return boolan
	 */
	boolean settLeier(String leier) {
		if (this.leier == null) {
			this.leier = leier;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Sjekker om utleid
	 * @return boolean
	 */
	boolean ledig() {
		if (leier == null) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Setter leier til null
	 */
	void settLedig() {
		leier = null;
	}
}