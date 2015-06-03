/*
Klasse for en person
*/
class Person {
	private String navn, bosted;
	private int alder;

	//Constructor
	public Person() {
		alder = 0;
		navn = "Ukjent";
		bosted = "Ukjent";
	}

	/*Setter navn paa person
	@param navn navnet paa personen*/
	public void navn(String navn){
		this.navn = navn;
	}

	/*Setter bosted
	@param bosted navn paa bosed*/
	public void bosted(String bosted){
		this.bosted = bosted;
	}

	/* Alder paa person
	@param alder alder paa person*/
	public void alder(int alder) {
		this.alder = alder;

		if (alder > 14) {
			Mobil nymobil = new Mobil(this.navn);
			System.out.println("YESS! " + nymobil.getEier() + " har faat mobil fordi han er over 14aar.");
		}
	}
	
	/*Test for aa sjekke klasse
	@return returnerer en variabel*/
	public int getAlder(){
		return alder;
	}
}