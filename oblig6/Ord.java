public class Ord {

	private String ord;
	private int antall;

	//Konstruktør
	Ord(String o) {
		ord = o;
		antall++;
	}

	//Grensesnitt
	public String toString() {
		return ord;
	}

	int hentAntall() {
		return antall;
	}

	void oekAntall() {
		antall++;
	}

}