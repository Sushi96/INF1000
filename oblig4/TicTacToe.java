import java.util.Scanner;

public class TicTacToe {
	public static void main (String[] args) {
		//Brettet
		int[] rad0 = {0,0,0};
		int[] rad1 = {0,0,0};
		int[] rad2 = {0,0,0};

		int spillErFerdig = 0;

		//Navn på spillere
		Scanner in = new Scanner(System.in);
		System.out.print("Navn på spiller 1: ");
		String spiller1 = in.nextLine();
		System.out.print("Navn på spiller 2: ");
		String spiller2 = in.nextLine();

		System.out.print("\n1 : " + spiller1 + " har en brikke der\n");
		System.out.print("2 : " + spiller2 + " har en brikke der\n");

		//Spill loop
		while (spillErFerdig == 0) {
			//Brett
			printBrett(rad0, rad1, rad2);

			//Spiller 1
			spillerEn(rad0, rad1, rad2, spiller1);
			//Sjekker om vinner
			spillErFerdig = spillErFerdig(rad0, rad1, rad2);
			if (spillErFerdig == 0) {
				//Brett
				printBrett(rad0, rad1, rad2);

				//Spiller 2
				spillerTo(rad0, rad1, rad2, spiller2);

				//Sjekker om vinner
				spillErFerdig = spillErFerdig(rad0, rad1, rad2);
			}
		}

		//Printer vinner
		if (spillErFerdig == 1){
			printBrett(rad0, rad1, rad2);
			System.out.println(spiller1 + " vant spillet!");
		}else if (spillErFerdig == 2){
			printBrett(rad0, rad1, rad2);
			System.out.println(spiller2 + " vant spillet!");
		} else {
			System.out.println("Ingen vinner.");
		}
	}
	//Sjekker om felt er ledig
	static int koordinatLedig(int rad, int plass, int spiller, int[] rad0, int[] rad1, int[] rad2){
		int ledig = 0;
		plass--;
		if (rad == 1 && rad0[plass] == 0) {
			ledig = 1;
		}
		else if (rad == 2 && rad1[plass] == 0) {
			ledig = 1;
		}
		else if(rad == 3 && rad2[plass] == 0) {
			ledig = 1;
		} else {
			System.out.println("Denne plassen er tatt.");
		}
		return ledig;
	}
	//Sjekker om spillet er ferdig før spillet er ferdig
	//kaarer vinner
	static int spillErFerdig(int[] rad0, int[] rad1, int[] rad2) {
		//Sjekker om spillet er ferdig med sum fra linjer
		int ferdig = 0;

		/*
		rad0[0] rad0[1] rad0[2]
		rad1[0] rad1[1] rad1[2]
		rad2[0] rad2[1] rad2[2]
		*/

		//Horisontalt
		//Rad1
		if ((rad0[0] + rad0[1] + rad0[2] == 3) && rad0[1] != 2 && rad0[1] != 2 && rad0[2] != 2){ferdig = 1;}
		if ((rad0[0] + rad0[1] + rad0[2] == 6) && rad0[1] != 1 && rad0[1] != 1 && rad0[2] != 1){ferdig = 2;}
		//Rad2
		if ((rad1[0] + rad1[1] + rad1[2] == 3) && rad1[1] != 2 && rad1[1] != 2 && rad1[2] != 2){ferdig = 1;}
		if ((rad1[0] + rad1[1] + rad1[2] == 6) && rad1[1] != 1 && rad1[1] != 1 && rad1[2] != 1){ferdig = 2;}
		//Rad3
		if ((rad2[0] + rad2[1] + rad2[2] == 3) && rad2[1] != 2 && rad2[1] != 2 && rad2[2] != 2){ferdig = 1;}
		if ((rad2[0] + rad2[1] + rad2[2] == 6) && rad2[1] != 1 && rad2[1] != 1 && rad2[2] != 1){ferdig = 2;}
		
		//Vertikalt
		//Rad1
		if ((rad0[0] + rad1[0] + rad2[0] == 3) && rad0[0] != 2 && rad1[0] != 2 && rad2[0] != 2){ferdig = 1;}
		if ((rad0[0] + rad1[0] + rad2[0] == 6) && rad0[0] != 1 && rad1[0] != 1 && rad2[0] != 1){ferdig = 2;}
		//Rad2
		if ((rad0[1] + rad1[1] + rad2[1] == 3) && rad0[1] != 2 && rad1[1] != 2 && rad2[1] != 2){ferdig = 1;}
		if ((rad0[1] + rad1[1] + rad2[1] == 6) && rad0[1] != 1 && rad1[1] != 1 && rad2[1] != 1){ferdig = 2;}
		//Rad3
		if ((rad0[2] + rad1[2] + rad2[2] == 3) && rad0[2] != 2 && rad1[2] != 2 && rad2[2] != 2){ferdig = 1;}
		if ((rad0[2] + rad1[2] + rad2[2] == 6) && rad0[2] != 1 && rad1[2] != 1 && rad2[2] != 1){ferdig = 2;}
		
		//Skraa
		//Venstre nederst gjorne
		if ((rad2[0] + rad1[1] + rad0[2] == 3) && rad2[0] != 2 && rad1[1] != 2 && rad0[3] != 2){ferdig = 1;}
		if ((rad2[0] + rad1[1] + rad0[2] == 6) && rad2[0] != 1 && rad1[1] != 1 && rad0[3] != 1){ferdig = 2;}
		//Hoyre nederst gjorne
		if ((rad2[2] + rad1[1] + rad0[0] == 3) && rad2[2] != 2 && rad1[1] != 2 && rad0[0] != 2){ferdig = 1;}
		if ((rad2[2] + rad1[1] + rad0[0] == 6) && rad2[2] != 1 && rad1[1] != 1 && rad0[0] != 1){ferdig = 2;}
		
		//Sjekk om brettet er fult
		boolean ikkeFult = true;

		ikkeFult = fullRad(rad0);
		if (ikkeFult) {
			ikkeFult = fullRad(rad1);
		}
		if (ikkeFult) {
			ikkeFult = fullRad(rad2);
		}
		//Uavgjort
		if (ikkeFult) {
			ferdig = 3;
		}

		return ferdig;
		
	}
	//Sjekker om raden har ledig plass
	static boolean fullRad(int[] rad) {
		for(int s: rad){
			if(s == 0)
				return false;
		}
		return true;
	}
	//Spiller 1
	static int spillerEn(int[] rad0, int[] rad1, int[] rad2, String spiller){
		int ledig = 0;
		int rad = 0;
		int plass = 0;
		while (ledig == 0) {
			Scanner in = new Scanner(System.in);
			System.out.println(spiller + " sin tur!");
			System.out.print("Velg rad: ");
			String r = in.nextLine();
			rad = Integer.parseInt(r);
			System.out.print("Velg plass: ");
			String p = in.nextLine();
			plass = Integer.parseInt(p);

			//Sjekk om ledig, skriv til arrays
			ledig = koordinatLedig(rad, plass, 1, rad0, rad1, rad2);
		}
		plass = plass - 1;
		if (rad == 1) {
			rad0[plass] = 1;
			return rad2[plass];
		} else if (rad == 2) {
			rad1[plass] = 1;
			return rad2[plass];
		} else if (rad == 3) {
			rad2[plass] = 1;
			return rad2[plass];
		} else {
			System.out.println("Det skjedde en feil.");
			return 0;
		}
	}
	//Spiller 2
	static int spillerTo(int[] rad0, int[] rad1, int[] rad2, String spiller){
		int ledig = 0;
		int rad = 0;
		int plass = 0;
		while (ledig == 0) {
			Scanner in = new Scanner(System.in);
			System.out.println(spiller + " sin tur!");
			System.out.print("Velg rad: ");
			String r = in.nextLine();
			rad = Integer.parseInt(r);
			System.out.print("Velg plass: ");
			String p = in.nextLine();
			plass = Integer.parseInt(p);

			//Sjekk om ledig, skriv til arrays
			ledig = koordinatLedig(rad, plass, 2, rad0, rad1, rad2);
		}
		plass = plass - 1;
		if (rad == 1) {
			rad0[plass] = 2;
			return rad2[plass];
		} else if (rad == 2) {
			rad1[plass] = 2;
			return rad2[plass];
		} else if (rad == 3) {
			rad2[plass] = 2;
			return rad2[plass];
		} else {
			System.out.println("Det skjedde en feil.");
			return 0;
		}
	}
	//Printer brettet
	static void printBrett(int[] rad0, int[] rad1, int[] rad2){
		//Horisontal linje 1
		System.out.println("\nRad 1: " + rad0[0] + "  " + rad0[1] + "  " + rad0[2]);
		//Horisontal linje 2
		System.out.println("Rad 2: " + rad1[0] + "  " + rad1[1] + "  " + rad1[2]);
		//Horisontal linje 3
		System.out.println("Rad 3: " + rad2[0] + "  " + rad2[1] + "  " + rad2[2] + "\n");

	}
}