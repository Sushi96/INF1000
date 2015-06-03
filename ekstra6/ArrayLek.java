import java.util.*;

class ArrayLek {
	public static void main(String[] args) {

		//Oppgave E.2 A)
		Scanner in = new Scanner(System.in);
		int arrayPlasser = 5;
		int[] heltall =  new int[arrayPlasser];

		for (int i=0; i != arrayPlasser; i++) {
			System.out.print("Skriv tall nr. " + (i + 1) + ": ");
			heltall[i] = Integer.parseInt(in.nextLine());
		}

		//Oppgave E.2 B)
		int storstTall = storsteTall(heltall);
		System.out.println(storstTall);

		//Oppgave E.2 C)
		reverserArray();
	}
	static int storsteTall(int[] heltall) {
		int storstTall = 0;
			
		for (int i = 0; i < heltall.length; i++) {
			if (heltall[i] > storstTall) {
				storstTall = heltall[i];
			}
		}

		return storstTall;
	}
	static int[] reverserArray(int[] heltall) {

		return 
	}
}