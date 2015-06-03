import java.util.Scanner;
import java.io.*;

public class Innlesning {
	public static void main (String[] args ) throws Exception {

	String filnavn = "winnie.txt";
	File fil = new File(filnavn);

	//Leser fra linje
	Scanner innFil2 = new Scanner(fil);
	Scanner innFil = new Scanner(fil);
	Scanner in = new Scanner(System.in);
	int antallB = 0;
	int antallC = 0;

	//Oppg 4.1 A og B)
	while (innFil.hasNextLine()) {
		String linje = innFil.nextLine();
		if (linje.equals("Winnie-the-Pooh")) {
			antallB++;
		}
	}
	System.out.println("Winnie-the-Pooh forekommer " + antallB + " ganger.");

	//Oppg 4.1 C) 
	System.out.print("Skriv inn noe du vil telle i teksten(eksempel ´the´): ");
	String input = in.nextLine();

	while (innFil2.hasNextLine()) {
		String linje = innFil2.nextLine();
		if (linje.equals(input)) {
			antallC++;
		}
	}
	System.out.println(input + " forekommer " + antallC + " ganger.");
	}
}