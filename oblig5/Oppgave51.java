class Oppgave51 {
	public static void main(String[] args) {

		//Oppg 5.1 A)
		Mobil iphone6 = new Mobil();

		String merke = "Apple";
		String eier = "Marius";
		int telefonnummer = 95076607;

		iphone6.merke(merke);
		iphone6.eier(eier);
		iphone6.telefonnummer(telefonnummer);

		//Oppg 5.1 B)
		Person marius = new Person();

		String navn = "Marius";
		int alder = 21;
		String bosted = "Oslo";

		marius.navn(navn);
		marius.alder(alder);
		marius.bosted(bosted);

		System.out.println("Test fra klasse Mobil: " + marius.getAlder());
		System.out.println("Test fra klasse Person: " + iphone6.getEier());
	}
}