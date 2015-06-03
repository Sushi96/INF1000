public class Kalkulator {
	public static void main (String[] args){
		
		//Oppg 4.3 A)
		int svarA = addisjon(3,4);
		System.out.println("Svaret er " + svarA);

		//Oppg 4.3 B)
		int svarB = subtraksjon(5, 2);
		System.out.println("Svaret er " + svarB);

		//Oppg 4.3 C)
		int svarC = helTallsDivisjon(10, 3);
		System.out.println("Svaret er " + svarC);

		//Oppg 4.3 D)
		double svarD = divisjon(10.0, 3.0);
		System.out.println("Svaret er " + svarD);

	}
	//Oppg 4.3 A)
	static int addisjon(int helTall1, int helTall2){
		int svar = helTall1+helTall2;
		return svar;
	}
	//Oppg 4.3 B)
	static int subtraksjon(int tall1, int tall2){
		int svar = tall1-tall2;
		return svar;
	}
	//Oppg 4.3 C)
	static int helTallsDivisjon(int tall1, int tall2){
		int svar = tall1/tall2;
		return svar;
	}
	//Oppg 4.3 D)
	static double divisjon(double tall1, double tall2){
		double svar = tall1/tall2;
		return svar;
	}
}