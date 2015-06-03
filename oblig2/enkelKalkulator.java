//Importerer Scanner
import java.util.Scanner;

public class enkelKalkulator {

	//Oppgave 2.3 A)
	public static void plussToTall(int tall1, int tall2){
		System.out.println("Sum tall: " + (tall1 + tall2));
	}
	//Oppgave 2.3 B)
	public static void differanseToTall(int tall1, int tall2){
		//Unngår negativ differanse
		if (tall1 > tall2){
			System.out.println("Differanse av tallene: " + (tall1 - tall2));
		} else {
			System.out.println("Differanse av tallene: " + (tall2 - tall1));
		}
	}
	//Oppgave 2.3 C)
	public static void produktToTall(int tall1, int tall2){
		System.out.println("Produktet av de to tallene er: " + (tall1 * tall2));
	}

    public static void main(String [] args) {

	//Oppgave 2.3 D)
	//Starter scanner
	Scanner in = new Scanner(System.in);

	//Input tall 1
	System.out.print("Skriv inn tall 1: ");
	String input1 = in.nextLine();
	int tall1 = Integer.parseInt(input1);

	//Input tall 2
	System.out.print("Skriv inn tall 2: ");
	String input2 = in.nextLine();
	int tall2 = Integer.parseInt(input2);

	//Sender input til metoder
	plussToTall(tall1, tall2);
	differanseToTall(tall1, tall2);
	produktToTall(tall1, tall2);
		  
    }
}
