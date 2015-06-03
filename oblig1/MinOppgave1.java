/** OPPGAVE 1.5 - MinOppgave1.java
 * Tema: Egen oppgave
 *
 * Finn p� din egen oppgave som har med besluttninger (if/else) � gj�re, og l�s
 * den! Dette kan f.eks. v�re et quiz program som stiller sp�rsm�l og sjekker om
 * svar er korrekte.
 */

import java.util.Scanner;

public class MinOppgave1 {

    public static void main(String [] args) {
	Scanner in = new Scanner(System.in);
	int poeng = 0;

	System.out.println("Velkommen til QuizMaster2000!");
	System.out.println("Gj�r deg klar for f�rste sp�rsm�l om 3...2..1!");

	//Sp�rsm�l 1 - Hva er det morsomste emnet  p� IFI
	System.out.println("Hva er det morsomeste emnet ved IFI?");
	String sporsmaal1 = in.nextLine();

	if (sporsmaal1.equals("inf1000") || sporsmaal1.equals("INF1000") || sporsmaal1.equals("Inf1000")){
	    System.out.println("Riktig!");
	    poeng++;
	}else{
	    System.out.println("Feil.");
	}

	//Sp�rsm�l 2 - Skriv et addisjonsstykke og regn det ut
	System.out.println("Sp�rsm�l 2:");
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
