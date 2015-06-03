class Tekster {
	public static void main(String[] args) {

		//Oppgave 5.3 A)
		String tekst = "Agnes i senga"; 
		String nytekst = ""; 
		System.out.println("For: " + tekst);
		int index = tekst.length() - 1;
		        
		while (index > -1)
		{
		   nytekst = nytekst + tekst.charAt(index);
		   index--;
		}
		System.out.println("Etter: " + nytekst);

		//Oppgave 5.3 B)
		String inf1000Stor = "INF1000";
		String inf1000liten = "inf1000";

		boolean like = inf1000liten.equals(inf1000Stor);
		System.out.println("Er INF1000 og inf1000 likt: " + like);

		//Oppgave 5.3 C)
		String delTekst = new String ("INF1100 INF1000 INF1010");
		String delTekstFerdig = (delTekst.substring(0,8) );
		System.out.println(delTekstFerdig);

		//Oppgave 5.4 D)
		String eventyr = new String ("Espen Askeladd");

		char[] eventyrArr = eventyr.toCharArray();

		for (int i = 0; i < eventyrArr.length; i++) {
			if (eventyrArr[i] == 'a') {
				eventyrArr[i] = 'A';
			}

		}
		for (char verdi : eventyrArr) {
			System.out.println(verdi);
		}
	}
}