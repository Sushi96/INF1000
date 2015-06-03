class Oblig6 {
	public static void main(String[] args) throws Exception {
	
	Ordliste ol = new Ordliste();
	ol.lesBok("scarlet.text");	

	//Oppg. A
	//Hvor mange ulike ord er brukt i boken?
	System.out.println("Det er brukt " + ol.antallOrd() + " antall ord i boken.");

	//Oppg. B
	//Hvor mange ganger er ordet Holmes brukt?
	String ordB = "Holmes";
	System.out.println("Ordet Holmes er brukt " + ol.antallForekomster(ordB) + " ganger i boken.");

	//Oppg. C
	//Hvor mange ganger er ordet elementary brukt?
	String ordC = "elementary";
	System.out.println("Ordet elementary er brukt " + ol.antallForekomster(ordC) + " ganger i boken.");

	//Oppg. D
	//Hvilket ord er brukt flest ganger?
	System.out.println("Det vanligste ordet er: " + ol.vanligste());
	}
}