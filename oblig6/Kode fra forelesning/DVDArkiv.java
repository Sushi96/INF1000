import java.util.Scanner;
import java.io.*;

class DVDArkiv {
  private String arkivnavn;
  private DVD[] arkiv = new DVD[1000];
  private int antall = 0;

  DVDArkiv(String navn) {
    arkivnavn = navn;
  }

  public String toString() {
    return "DVD-arkivet " + arkivnavn;
  }

  void lesArkiv() throws Exception {
    File f = new File(arkivnavn);

    if (f.exists()) {
      Scanner s = new Scanner(f);
	
      while (s.hasNextLine()) {
	arkiv[antall] = new DVD(s.nextLine());
	antall++;
      }
      s.close();
      System.out.println("Arkivet " + arkivnavn + " er lest.");
    } else {
      System.out.println("Nytt arkiv " + arkivnavn + " opprettet.");
    }
  }

  void skrivArkiv() throws Exception {
    PrintWriter p = new PrintWriter(arkivnavn);

    for (int i = 0;  i < antall;  i++) {
      p.println(arkiv[i]);
    }
    p.close();
  }

  void utfoerKommandoer() {
    Scanner s = new Scanner(System.in);

    while (true) {
      System.out.println();
      System.out.println("Gi en kommando:");
      System.out.println("  A (Avslutt)");
      System.out.println("  N (Ny DVD)");
      System.out.println("  V (Vis oversikt)");
      System.out.print("Kommando: ");

      String kommando = s.nextLine();
      if (kommando.startsWith("A")) {
	return;
      } else if (kommando.startsWith("N")) {
	System.out.print("DVDens navn: ");
	arkiv[antall] = new DVD(s.nextLine());
	antall++;
      } else if (kommando.startsWith("V")) {
	for (int i = 0;  i < antall;  i++) {
	    System.out.println(i + ". " + arkiv[i]);
	}
      } else {
	System.out.println("'" + kommando + 
	  "' er en ulovlig kommando!");
      }
    }
  }
}
