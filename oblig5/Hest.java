class Hest {
	private String navn;

	//Constructor
	public Hest() {
		navn = "Ukjent";
	}
	public void navn(String navn) {
		this.navn = navn;
	}

	//@return navn paa Hest
	public String getNavn() {
		return navn;
	}
}