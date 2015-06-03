/**
* Main metode for DVDarkiv
* oblig. 7
* Main metode for å opprette og kjøre program
*
* @author Marius Christensen
* @version 1.0
*/

public class DVDarkiv {
	public static void main(String[] args) throws Exception {
		//Oppretter programmet
		DVDadministrasjon filmer = new DVDadministrasjon();

		//Starter programmeny
		filmer.meny();
	}
}