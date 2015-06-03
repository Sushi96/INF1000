class Ku {
	private String navn;

	//Constructor
	public Ku() {
		navn = "Ukjent";
	}
	public void navn(String navn) {
		this.navn = navn;
	}

	//@return navn paa Ku
	public String getNavn() {
		return navn;
	}
}