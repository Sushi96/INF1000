class Gris {
	private String navn;

	//Constructor
	public Gris() {
		navn = "Ukjent";
	}
	public void navn(String navn) {
		this.navn = navn;
	}

	//@return navn paa Gris
	public String getNavn() {
		return navn;
	}
}