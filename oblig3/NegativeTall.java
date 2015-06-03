public class NegativeTall {
	public static void main (String [] args) {

		//Oppg 3.4 A)
		int[] a = {1, 4, 5, -2, -4, 6, 10, 3, -2};
		int b = 0;

		for (int t = 0; a.length > t; t++) {
			if (a[t] < 0){
				b++;
			}
		}
		System.out.println("Lokken inneholder: " + b + " negative tall.");

		//Oppg 3.4 B)
		int n = 0;
		int s = 0;
		while ( a.length > s) {
			if (a[s] < 0) {
				n++;
			}
			s++;
		}
		System.out.println("Lokken inneholder: " + n + " negative tall.");

		//Oppg 3.4 C)
		for (int c = 0; c < a.length; c++) {
			if (a[c] < 0) {
				a[c] = c;
				System.out.println(a[c]);
			}
		}
	}
}