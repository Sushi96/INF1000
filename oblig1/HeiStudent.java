//Importerer scanner
import java.util.Scanner;

public class HeiStudent {

    public static void main(String [] args) {
	//Gjør klar Scanner
	Scanner in = new Scanner(System.in);

	//Oppg. 1.1 a)
	System.out.println("Hei Student");

	//Oppg. 1.1 b)
        String navn = "Marius";
	System.out.println("Hei " + navn);

	//Oppg. 1.1 c)
	System.out.println("Skriv navnet ditt:");
	String navnc = in.nextLine();
	System.out.println("Hello " + navnc);

	//Oppg. 1.1 d)
	int tall1 = 2;
	int tall2 = 3;
	System.out.println("Summen av 2 + 3 er " + (tall1 + tall2));

	//Oppg. 1.1 e)

	System.out.println("Skriv et tall:");
	String tall1e = in.nextLine();
	int tall1ee = Integer.parseInt(tall1e);
	System.out.println("Skriv inn et tall til:");
	String tall2e = in.nextLine();
	int tall2ee = Integer.parseInt(tall2e);
	System.out.print("Summen er: ");
	System.out.println(tall1ee + tall2ee);

    }
}
