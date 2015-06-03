//Importerer Scanner
import java.util.Scanner;

public class Beslutninger {

    public static void main(String [] args) {

	//Oppgave 1.2 a)
	int alder = 21;

	//Oppgave 1.2 b)
	if (alder > 18) {
	    System.out.println("Du er myndig!");

	}else {
	    System.out.println("Du er IKKE myndig!");
	}
	//Oppgave 1.2 c)
	Scanner in = new Scanner(System.in);
	System.out.println("Hvor gammel er du?");
	String alderc = in.nextLine();
	int alderout = Integer.parseInt(alderc);

	if (alderout >= 18) {
	    System.out.println("Du er myndig!");
	}else{
	    System.out.println("Du er IKKE mydig!");
	}
    }
}
