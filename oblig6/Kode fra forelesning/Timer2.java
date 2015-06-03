class Timer2 {
  private int[] sek;
  private boolean[] aktiv; 
  private int denneKlokke;

  Timer2(int antallKlokker) {
    sek = new int[antallKlokker];
    aktiv = new boolean[antallKlokker];
    denneKlokke = 0;
  }

  public String toString() {
    return "[" + denneKlokke + "] " + 
      (sek[denneKlokke]/60) + ":" + 
      (sek[denneKlokke]%60);
  }

  void stillTid(int m, int s) {
    sek[denneKlokke] = 60*m + s;
  }

  void start() {
    aktiv[denneKlokke] = true;
  }

  void stopp() {
    aktiv[denneKlokke] = false;
  }

  void nesteKlokke() {
    denneKlokke++;
    if (denneKlokke >= aktiv.length) {
      denneKlokke = 0;
    }
  }

  void tikk() {
    for (int i = 0;  i < aktiv.length;  i++) {
      if (aktiv[i]) {
	  if (sek[i] > 0) {
	      sek[i]--;
	  }

	if (sek[i] == 0) {
	  System.out.print("ALARM #" + i);
	  aktiv[i] = false;
	}
      }
    }
  }
}
