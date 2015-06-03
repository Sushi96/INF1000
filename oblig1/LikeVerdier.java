//Importer Scanner
import java.util.Scanner;

public class LikeVerdier {

    public static void main(String [] args) {


	//Oppgave 1.4 a)
	int c = 5;
	int d = 4;

	//Oppgave 1.4 b)
	if ( c == d) {
	    System.out.println("C og D er like!");
	}else{
	    System.out.println("C og D er IKKE like!");
	}
	
	//Oppgave 1.4 c)
	Scanner in = new Scanner(System.in);

	System.out.println("Skriv inn verdien for C:");
	String ctekst = in.nextLine();
	int ctall = Integer.parseInt(ctekst);

	System.out.println("Skriv inn verdien for D:");
	String dtekst = in.nextLine();
	int dtall = Integer.parseInt(dtekst);

	if (ctall == dtall) {
	    System.out.println("C og D er like!");
	}else{
	    System.out.println("C og D er IKKE like!");
	}
			   


    }
}
