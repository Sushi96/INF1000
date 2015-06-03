import java.util.*;
class Main44 {
	public static void main(String[] args) {
		//Oppretter ny bondegard
		Bondegard bondeGard = new Bondegard();

		// Oppretter GRISER
		Gris klara = new Gris();
		klara.navn("Klara");
		bondeGard.settInnGris(klara);
		Gris gisle = new Gris();
		gisle.navn("Gisle");
		bondeGard.settInnGris(gisle);
		Gris grise = new Gris();
		grise.navn("Grise");
		bondeGard.settInnGris(grise);
		Gris jens = new Gris();
		jens.navn("Jens");
		bondeGard.settInnGris(jens);
		Gris petter = new Gris(); 
		petter.navn("Petter");
		bondeGard.settInnGris(petter);

		// Oppretter HESTER
		Hest svarten = new Hest(); 
		svarten.navn("Svarten");
		bondeGard.settInnHest(svarten);
		Hest brunen = new Hest(); 
		brunen.navn("Brunen");
		bondeGard.settInnHest(brunen);

		// Oppretter KUER/KYR
		Ku olga = new Ku(); 
		olga.navn("Olga");
		bondeGard.settInnKu(olga);
		Ku helge = new Ku(); 
		helge.navn("Helge");
		bondeGard.settInnKu(helge);
		Ku qmelk = new Ku(); 
		qmelk.navn("Qmelk");
		bondeGard.settInnKu(qmelk);
		Ku oboy = new Ku(); 
		oboy.navn("Oboy");
		bondeGard.settInnKu(oboy);
		Ku flekken = new Ku(); 
		flekken.navn("Flekken");
		bondeGard.settInnKu(flekken);
		Ku billy = new Ku(); 
		billy.navn("Billy");
		bondeGard.settInnKu(billy);
		Ku trude = new Ku(); 
		trude.navn("Trude");
		bondeGard.settInnKu(trude);
		Ku hege = new Ku();
		hege.navn("Trude");
		bondeGard.settInnKu(hege);

		//Oppgave 5.4 E)
		int selgG = 3;
		int selgH = 1;
		int selgK = 4;

		bondeGard.selgDyr("Gris", selgG);
		bondeGard.selgDyr("Hest", selgH);
		bondeGard.selgDyr("Ku", selgK);

		//Oppgave 5.4 F)
		bondeGard.skrivUt();

		//Oppgave 5.4 G)
		int valg = -1;
		Scanner scan = new Scanner(System.in);

		while (valg != 0) {
			System.out.println("1: Sett inn gris | 2: Sett inn hest | 3: Sett inn ku | 4: Selg dyr | 5: Skriv ut | 0: Avslutt");
			System.out.print("Gi et valg: ");
			valg = Integer.parseInt(scan.nextLine());

			if (valg == 1) {
				//Set inn gris
				lesInnGris(bondeGard);
			} else if (valg == 2) {
				//Sett inn hest
				lesInnHest(bondeGard);
			} else if (valg == 3) {
				//Sett inn ku
				lesInnKu(bondeGard);
			}else if (valg == 4) {
				// Selg et dyr
				selgDyr(bondeGard);
			}else if (valg == 5) {
				//Skriv bondegard
				bondeGard.skrivUt();
			}else if (valg == 0){
				//Avslutt
				valg = 0;
			}else {
				System.out.println("Ugyldig valg.");
			}
		}
	}

	// Opprett ny gris
	static void lesInnGris(Bondegard bondeGard) {
		Scanner scan = new Scanner(System.in);
		String navn;

		//Navn
		System.out.println("Hva er navnet på dyret?");
		navn = scan.nextLine();

		//Sett inn
		Gris nyGris = new Gris();
		nyGris.navn(navn);
		bondeGard.settInnGris(nyGris);

	}

	// Opprett ny hest
	static void lesInnHest(Bondegard bondeGard) {
		Scanner scan = new Scanner(System.in);
		String navn;

		//Navn
		System.out.println("Hva er navnet på dyret?");
		navn = scan.nextLine();

		//Sett inn
		Hest nyHest = new Hest();
		nyHest.navn(navn);
		bondeGard.settInnHest(nyHest);
		
	}

	// Opprett ny ku
	static void lesInnKu(Bondegard bondeGard) {
		Scanner scan = new Scanner(System.in);
		String navn;

		//Navn
		System.out.println("Hva er navnet på dyret?");
		navn = scan.nextLine();

		//Sett inn
		Ku nyKu = new Ku();
		nyKu.navn(navn);
		bondeGard.settInnKu(nyKu);

	}

	//Selg dyr. @param type, antall
	static void selgDyr(Bondegard bondeGard) {
		Scanner scan = new Scanner(System.in);
		int valg = -1;
		int antall = 0;

		//Antall
		System.out.println("Hvor mange dyr vil du selge?");
		antall = Integer.parseInt(scan.nextLine());

		//Type
		while (valg != 0) {
			System.out.println("Hva slags dyr er det? 1: Gris | 2: Hest | 3: Ku | 0: Avslutt");
			System.out.print("Gi et valg: ");
			valg = Integer.parseInt(scan.nextLine());
			if (valg == 1) { //Gris
				bondeGard.selgDyr("Gris", antall);
				valg = 0;
			} else if (valg == 2) { //Hest
				bondeGard.selgDyr("Hest", antall);
				valg = 0;
			} else if (valg == 3) { //Ku
				bondeGard.selgDyr("Ku", antall);
				valg = 0;
			} else if (valg == 0) { //Avslutt
				valg = 0;
			} else {
				System.out.println("Ugyldig valg.");
			}
		}
	}
}