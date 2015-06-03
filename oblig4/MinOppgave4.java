//Dette programmet leser filen MinTekst.txt
//Så setter det linjene inn i en array
//Deretter kaller den en metode som leser linje 3
//Linje 3 blir returnert og skrevet ut i main

//Programmet har ingen mening ellers

import java.util.Scanner;
import java.io.*;

public class MinOppgave4 {
	public static void main (String[] args) throws Exception {
		String filnavn = "MinTekst4.txt";
		File fil = new File(filnavn);
		Scanner innFil = new Scanner(fil);

		String[] tekstArr = new String[80];

		int i = 0;
		while (innFil.hasNextLine()){
			String linje = innFil.nextLine();
			tekstArr[i] = linje;
			i++;
		}
		String skrivUt = langLinje(tekstArr);
		System.out.println(skrivUt);
	}
	static String langLinje(String[] tekstBiter) {

		String linje = tekstBiter[2];

		return linje;
	}
}