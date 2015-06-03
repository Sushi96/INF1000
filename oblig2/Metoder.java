//Importerer Scanner
import java.util.Scanner;

public class Metoder {

	//Metode for navn og bosted oppg. 2.1 a)
	static void navnBosted(){
		Scanner in = new Scanner(System.in);
		System.out.print("Skriv inn navn: ");
		String navn = in.nextLine();
		System.out.print("Skriv inn bosted: ");
		String bosted = in.nextLine();
		System.out.println("Hei, " + navn + "! Du er fra " + bosted + ".");
	}

    public static void main(String [] args) {

	Scanner in = new Scanner(System.in);

	//Oppgave 2.1 a)
	System.out.println("Starter oppg. 2.1A");
	System.out.print("Skriv inn navn: ");
	String navn = in.nextLine();
	System.out.print("Skriv inn bosted: ");
	String bosted = in.nextLine();

	System.out.println("Hei, " + navn + "! Du er fra " + bosted + ".");


	//Oppgave 2.1 b)
	System.out.println("Starter oppg. 2.1A");

	navnBosted();
	navnBosted();
	navnBosted();
			  
    }
}
