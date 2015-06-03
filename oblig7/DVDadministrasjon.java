/**
* Strukturklasse for Personer og DVDer
* oblig. 7
*
* @author Marius Christensen
* @version 1.0
*/

import java.util.*; //ArrayList, PrintWriter, Scanner, HashMap
import java.io.*; //Lese fra fil

public class DVDadministrasjon {

	//Variabler
	private Scanner sc = new Scanner(System.in);
	private HashMap<String, Person> navneliste = new  HashMap<String, Person>();

	/**
	 * Konstruktør
	 */
	public DVDadministrasjon() throws Exception{
		File fil = new File("arkiv.txt");
		Scanner scan = new Scanner(fil);

		while(scan.hasNextLine()) {
			String navn = scan.nextLine();
			navn = navn.trim(); //Tar bort whitespace
			navneliste.put(navn, new Person(navn));

			while(true && scan.hasNextLine()) {
			    String nesteLinje = scan.nextLine();
			    if ( nesteLinje.equals("") ) {
			       break;
			    } else if (nesteLinje.substring(0, 1).equals("*") && nesteLinje.length() != 0) {
			    	String tittel = nesteLinje.substring(1);
			    	String leier = scan.nextLine();
			    	//Lagre til leier
			    	hentPerson(navn).nyDvd(tittel, navn);
			    	hentPerson(navn).settUtlaan(tittel, leier);
			    	if (hentPerson(leier) == null) {
			    		navneliste.put(leier, new Person(leier));
			    	}
					hentPerson(leier).addUtleid();
			    } else {
			    	String dvd = nesteLinje;
					hentPerson(navn).nyDvd(dvd, navn);
			    }
			}
		}
	}

	/**
	 * Programmeny
	 */
	void meny() throws Exception{
		boolean programSlutt = false;

		while (!programSlutt) {
			System.out.print("[A)vslutt, K)joep, L)aan, N)y person, O)versikt, R)etur, V)is]: ");
			String innTekst = sc.nextLine();
			String valg = innTekst;
			if (innTekst.length() > 0) {
				valg = innTekst.substring(0, 1);
			}

			switch (valg.toUpperCase()) {
	            case "A": //Avslutt og lagre
	            	programSlutt = true;
	                break;

	            case "K": //Legg til ny kjøp DVD
	            	kjop();
	                break;

	            case "L": //Lån bort en DVD
	            	laanDVD();
	                break;

	            case "N": //Ny person
	            	nyPerson();
	                break;

	            case "O": //Oversikt
	            	oversikt();
	                break;

	            case "R": //Retur av lånt DVD
	            	returLaan();
	                break;

	            case "V": //Vis
            		vis();
                    break;

	            default:
	           		System.out.println("Ugyldig valg. Prov paa nytt.");
	                break;
        	}
		}
		lagre();
	}

	/**
	 * Legg til ny kjøpt DVD
	 *
	 * Skal sjekke at ikke DVD er kjøpt før
	 * @return [description]
	 */
	void kjop(){
		System.out.print("Hvem har kjopt en DVD? ");
		String navn = sc.nextLine();

		if (finnesPerson(navn) != false) {
			System.out.print("Hva heter DVDen? ");
			String tittel = sc.nextLine();
			if (hentPerson(navn).eierDvd(tittel) == false) {
				hentPerson(navn).nyDvd(tittel, navn);
			} else {
				System.out.println("Du eier allerede denne DVDen.");
			}
		} else {
			System.out.println("Det er ingen som heter " + navn + ".");
		}
	}

	/**
	 * Lån bort en DVD
	 *
	 * Navnene må finnes. Eier må eie DVDen.
	 * Ikke være utlånt allerede. Ikke låne av seg selv.
	 * 
	 */
	void laanDVD() {
		System.out.print("Hvem vil laane en DVD? ");
		String leier = sc.nextLine();
		if (finnesPerson(leier)) {
			System.out.print("Hvem vil han/hun laane av? ");
			String eier = sc.nextLine();
			if (eier.equalsIgnoreCase(leier)) {
				System.out.println("Du kan ikke laane av deg selv.");
			}
			else if (finnesPerson(eier)) {
				System.out.print("Hva heter DVDen? ");
				String tittel = sc.nextLine();
				if (hentPerson(eier).eierDvd(tittel)) {
					if (hentPerson(eier).ledig(tittel)) {
						hentPerson(eier).settUtlaan(tittel, leier);
						hentPerson(leier).addUtleid();
					}else {
						System.out.println("DVDen er allerede utleid.");
					}
				}else {
					System.out.println(eier + " eier ikke denne DVDen.");
				}
			} else{
				System.out.println("Det er ingen som heter " + eier + ".");
			}
		} else{
			System.out.println("Det er ingen som heter " + leier + ".");
		}
	}

	/**
	 * Legg til ny person
	 */
	void nyPerson() {
		System.out.print("Navn paa den nye personen: ");
		String navn = sc.nextLine();
		if (!("".equals(navn))) {

			if (finnesPerson(navn)) {
				System.out.println("Person finnes. Velg et annet kallenavn.");
			} else{
				navneliste.put(navn, new Person(navn));
			}
		}else{
			System.out.println("Ugyldig lengde. Prov paa nytt.");
		}
	}

	/**
	 * Oversikt for hver person
	 *
	 * EKSEMPEL:
	 * Per eier 2 DVDer, har laant ut 1 og har laant 0
	 * Kari eier 0 DVDer, har laant ut 0 og har laant 1
	 * 
	 */
	void oversikt() {
		if (!erTomt()) {
			for(Person p : navneliste.values()) {
				System.out.println(p + " eier " + p.antallDvd() + " DVDer, har laant ut " + p.antallLaant() + " og har laant " + p.antallUtleid() + ".");
			}
		} else {
			System.out.println("Det finnes ingen personer.");
		}
		System.out.print("Trykk enter...");
		String temp = sc.nextLine();
	}

	/**
	 * Returer lånt DVD
	 *
	 * Personer må finnes.
	 * DVD må finnes 
	 * Tittel må være lik
	 * Må være lånt til den personen
	 * 
	 */
	void returLaan() {
		System.out.print("Hvem eier DVDen? ");
		String eier = sc.nextLine();
		if (finnesPerson(eier)) {
			System.out.print("Hvem har laant den? ");
			String leier = sc.nextLine();
			if (finnesPerson(leier)) {
				System.out.print("Hva heter DVDen? ");
				String tittel = sc.nextLine();
				if (hentPerson(eier).eierDvd(tittel)) {
					if (hentPerson(eier).sjekkOmUtleidTil(leier, tittel)) {
						hentPerson(eier).leieSettLedig(tittel);
						hentPerson(leier).minusUtleid();
					}else {
						System.out.println("Tittelen stemmer ikke.");
					}
				}else {
					System.out.println(eier + " eier ikke denne DVDen.");
				}
			} else {
				System.out.println("Det er ingen som heter " + leier + ".");
			}
		} else {
			System.out.println("Det er ingen som heter " + eier + ".");
		}
	}

	/**
	 * Vis status for person, * for alle personer
	 *
	 * EKSEMPEL: 
	 * Per eier disse DVDene:
	 * 	The hobbit 1
	 *  The music man (laant av Kari)
	 * Kari eier disse DVDene:
	 * 
	 */
	void vis() {
		String navn;
		System.out.print("Vis DVDene til hvem (* for alle)? ");
		navn = sc.nextLine();

		if (navn.substring(0, 1).equals("*")) {
			visAlle();
		} else {
			if(finnesPerson(navn)) {
				visNavn(navn);
			} else {
				System.out.println("Det er ingen som heter " + navn + ".");
			}
		}

		System.out.print("Trykk enter...");
		String temp = sc.nextLine();
	}

	/**
	 * Hjelpemetode for å vise spesiel person
	 * @param  navn   navn som skal vises
	 */
	private void visNavn(String navn) {
		System.out.println(navn + " eier disse DVDene:");
		for (String verdi : hentPerson(navn).dvdSamling.keySet()){

            String key = verdi.toString();
            String value = hentPerson(navn).dvdSamling.get(key).toString();  
            System.out.println("	"  + value);  
		} 
		
	}

	/**
	 * Hjelpemetode for å vise alle personer
	 * 
	 */
	private void visAlle() {
		for (Person p : navneliste.values()) {
			System.out.println(p + " eier disse DVDene:");
			for (String verdi: p.dvdSamling.keySet()){

	            String key = verdi.toString();
	            String value = p.dvdSamling.get(key).toString();  
	            System.out.println("	"  + value);  
			} 
		}
	}

	/**
	 * Sjekker om person finnes i HashMap
	 * @return boolean
	 */
	private boolean finnesPerson(String navn) {
		return navneliste.containsKey(navn);
	}

	/**
	 * Sjekker om HashMapet med personer er tomt
	 * @return boolean
	 */
	private boolean erTomt() {
		return navneliste.isEmpty();
	}

	/**
	 * Returerer Person objektet til navn
	 * @param  navn navn på person
	 * @return      Person objektet
	 */
	private Person hentPerson(String navn) {
		return navneliste.get(navn);
	}

	/**
	 * Finner antall personer i arkivet
	 * @return int antall
	 */
	int antallPersoner() {
		return navneliste.size();
	}

	/**
	 * Lagre programmet til arkiv.txt før exit
	 *
	 * EKSEMPEL:
	 * Per
	 * The hobbit 1
	 * *The music man
	 * Kari
	 * 
	 * Kari
	 */
	void lagre() throws Exception{
	File fil = new File("arkiv.txt");
	PrintWriter pw = new PrintWriter(fil);

		for (Person p : navneliste.values()) {
			pw.println(p);
			for (String verdi: p.dvdSamling.keySet()){

	            String key = verdi.toString();
	            if (!(p.dvdSamling.get(key).ledig())) {
	            	pw.println("*" + key);
	            	String leier = p.dvdSamling.get(key).hentLeier();
	            	pw.println(leier);
	            } else {
	            	String value = p.dvdSamling.get(key).toString(); 
		            pw.println(value);
	            } 
			}
			pw.println("");
		}
		pw.close();
	}
}