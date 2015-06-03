/** OPPGAVE 1.5 - MinOppgave1.java
 * Tema: Egen oppgave
 *
 * Finn på din egen oppgave som har med besluttninger (if/else) å gjøre, og løs
 * den! Dette kan f.eks. være et quiz program som stiller spørsmål og sjekker om
 * svar er korrekte.
 */

import java.util.Scanner;

public class MinOppgave1 {

    public static void main(String [] args) {
	Scanner in = new Scanner(System.in);
	int poeng = 0;

	System.out.println("Velkommen til QuizMaster2000!");
	System.out.println("Gjør deg klar for første spørsmål om 3...2..1!");

	//Spørsmål 1 - Hva er det morsomste emnet  på IFI
	System.out.println("Hva er det morsomeste emnet ved IFI?");
	String sporsmaal1 = in.nextLine();

	if (sporsmaal1.equals("inf1000") || sporsmaal1.equals("INF1000") || sporsmaal1.equals("Inf1000")){
	    System.out.println("Riktig!");
	    poeng++;
	}else{
	    System.out.println("Feil.");
	}

	//Spørsmål 2 - Skriv et addisjonsstykke og regn det ut
	System.out.println("Spørsmål 2:");
	System.out.println("Skriv et tall:");
	String input = in.nextLine();
	int tall1 = Integer.parseInt(input);

	System.out.println("Skriv et tall til:");
	String input2 = in.nextLine();
	int tall2 = Integer.parseInt(input2);
	
	int sum = tall1 + tall2;

	System.out.println("Hva er summen av de to tallene du skrev?");
	String input3 = in.nextLine();
	int svar = Integer.parseInt(input3);

	if (sum == svar){
	    System.out.println("Du svarte riktig!");
	    poeng++;
	    
	}else{
	    System.out.println("Du svarte feil!");
	}

	//Resultat av quizen
	System.out.println("Du fikk " + poeng + " av 2 mulige poeng. :-)");

    }
}
