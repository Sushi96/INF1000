//Importerer Scanner
import java.util.Scanner;

public class Billettpris {

    public static void main(String [] args) {

	//Oppgave 1.3
	Scanner in = new Scanner(System.in);
	int billettpris = 50;
	int billettprisRabatt = 25; 
	
	System.out.println("Skriv inn alderen din:");
	String alderIn = in.nextLine();
	int alder = Integer.parseInt(alderIn);

	if (alder >= 12 && alder <= 67){
	    System.out.println("Du skal betale " + billettpris + "kr");
	}else{
	    System.out.println("Du skal betale " + billettprisRabatt + "kr");
	}
			  
    }
}
