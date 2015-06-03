//Oppave 3.1 A og B

import java.util.Scanner;

public class SumTall {
	public static void main(String [] args){

		Scanner in = new Scanner(System.in);
		
		int tall = 1;
		//Variabel til oppg B
		int n = 0;

		//Løkke som avsluttes med 0
		while (tall != 0) {
			System.out.print("Tallet ´0´ avslutter. Skriv et tall: ");
			String input = in.nextLine();
			tall = Integer.parseInt(input);
			//Summerer til oppg B)
			n = n + tall;
		}

		//Printer oppg B)
		System.out.println("Summen av tallene du har skrevet er: " + n);
	}
}