import java.io.*;
import java.util.*;

class OrdlisteMain {
	public static void main(String[] args) throws Exception {

	Ordliste ol = new Ordliste();
	ol.lesBok("bok.txt");

	String ordB = "Læringsmål";
	System.out.println("Ordet Læringsmål er brukt " + ol.antallForekomster(ordB) + " ganger i teksten.");

	System.out.println("Det vanligste ordet er: " + ol.vanligste());
	System.out.println(ol + ". Totalt antall: " + ol.antallOrd() );
	}
}