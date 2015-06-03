import java.util.Scanner;
import java.io.*;

public class Temperatur {
	public static void main (String[] args) throws Exception {
		String filnavn = "temperatur.txt";
		File fil = new File(filnavn);
		Scanner innFil = new Scanner(fil);
		int[] temperaturer = new int[12];
		int i = 0;

		//Oppg 4.2 A)
		while (innFil.hasNextLine()){
			String linje = innFil.nextLine();
			int temp = Integer.parseInt(linje);
			temperaturer[i] = temp;
			i++;
		}

		//Oppg 4.2 B)
		int gjSnittIAar = gjennomsnitt(temperaturer);
		System.out.println("Gjennomsnittet i aar har veart " + gjSnittIAar + " grader.");
	}
	static int gjennomsnitt(int[] temperaturer){
		int sum = 0;
		for (int i = 0; i < temperaturer.length; i++) {
			sum += temperaturer[i];
		}
		int gjsnitt = sum/temperaturer.length;

		return gjsnitt;
	}
}