/* Definerer hvilke og antall dyr
	Metoder for aa sette dyr inn i array
 */
class Bondegard {
	private int antallGriser = 10;
	private int antallHester = 5;
	private int antallKuer = 30;
	private static int grisInArray = 0;
	private static int hestInArray = 0;
	private static int kuInArray = 0;

	private Gris[] grisebinge = new Gris[antallGriser];
	private Hest[] stall = new Hest[antallHester];
	private Ku[] fjos = new Ku[antallKuer];

	public void skrivUt() {

		//Skriv ut griser
		System.out.println("Antall griser: " + grisInArray);
		String g = "";
		for (Gris verdi : grisebinge) {
			if (verdi != null) {
				g = g + verdi.getNavn() + "  ";
			}
		}
		System.out.print(g + "  ");

		//Skriv ut hester
		System.out.println("\nAntall hester: " + hestInArray);
		String h = "";
		for (Hest verdi : stall) {
			if (verdi != null) {
				h = h + verdi.getNavn() + "  ";
			}
		}
		System.out.print(h + "  ");

		//Skriv ut kuer
		System.out.println("\nAntall kuer: " + kuInArray);
		String k = "";
		for (Ku verdi : fjos) {
			if (verdi != null) {
				k = k + verdi.getNavn() + "  ";
			}
		}
		System.out.print(k + "  ");
		System.out.println("\n");
	}

	//Setter gris i array
	public void settInnGris(Gris g) {
		if (grisInArray != antallGriser) {
			grisebinge[grisInArray] = g;
			grisInArray++;
		} else {
			System.out.println("Grisebingen er full!");
		}
	}

	//Setter hest i array
	public void settInnHest(Hest h) {
		if (hestInArray != antallHester) {
			stall[hestInArray] = h;
			hestInArray++;
		} else {
			System.out.println("Stallen er full!");
		}
	}

	//Setter ku i array
	public void settInnKu(Ku k) {
		if (kuInArray != antallKuer) {
			fjos[kuInArray] = k;
			kuInArray++;
		} else {
			System.out.println("Fjoeset er fullt!");
		}
	}

	public void selgDyr(String type, int antall) {

		//Gris
		if (type.equals("Gris")) {
			for (int i = grisInArray; i >= (grisInArray - antall); i--) {
				grisebinge[i] = null;
			}
		grisInArray = grisInArray - antall;
		System.out.println("Du solgte " + antall + " " + type + "er.");

		//Hest
		} else if (type.equals("Hest")){
				for (int i = hestInArray; i >= (hestInArray - antall); i--) {
					stall[i] = null;
				}
			hestInArray = hestInArray - antall;
			System.out.println("Du solgte " + antall + " " + type + "er.");

		// Gris
		} else if (type.equals("Ku")) {
			for (int i = kuInArray; i >= (kuInArray - antall); i--) {
					fjos[i] = null;
				}
			kuInArray = kuInArray - antall;
			System.out.println("Du solgte " + antall + " " + type + "er.");
		
		// Ukjent dyr
		} else {
			System.out.println("Ukjent type dyr. Gris | Hest | Ku");
		}
	}
}