class Timer {
  private int[] min;
  private int[] sek;
  private boolean[] aktiv; 
  private int denneKlokke;

  Timer(int antallKlokker) {
    min = new int[antallKlokker];  
    sek = new int[antallKlokker];
    aktiv = new boolean[antallKlokker];
    denneKlokke = 0;
  }

  public String toString() {
    return "[" + denneKlokke + "] " + 
      min[denneKlokke] + ":" + 
      sek[denneKlokke];
  }

  void stillTid(int m, int s) {
    min[denneKlokke] = m;  
    sek[denneKlokke] = s;
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
	} else if (min[i] > 0) {
	  min[i]--;  sek[i] = 59;
	} 

	if (min[i]==0 && sek[i]==0) {
	  System.out.print("ALARM #" + i);
	  aktiv[i] = false;
	}
      }
    }
  }
}
