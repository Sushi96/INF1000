class Mobil {
	private String merke, eier;
	private int telefonnummer;

	//Constructor
	public Mobil() {
		merke = "Ikke satt";
		eier = "Ingen eier";
		int telefonnummer = 0;
	}

	//Constructor
	public Mobil(String eier) {
		merke = "Ikke satt";
		this.eier = eier;
		int telefonnummer = 0;
	}

	//Setter merke
	public void merke(String merke) {
		this.merke = merke;
	}

	//Setter eier
	public void eier(String eier) {
		this.eier = eier;
	}

	//Setter telefonnummer
	public void telefonnummer(int telefonnummer){
		this.telefonnummer = telefonnummer;
	}

	//Returnerer eier
	public String getEier(){
		return eier;
	}
}