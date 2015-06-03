class TestTimer2 {
    public static void main(String[] arg) {
	Timer2 t = new Timer2(2);

	t.stillTid(0, 10);  t.nesteKlokke();  
	t.stillTid(0, 20);  

	System.out.println(t);  t.nesteKlokke();  System.out.println(t);

	t.start();  t.nesteKlokke();  
	t.start();

	for (int i = 1;   i <= 25;  i++) {
	    System.out.print(".");  t.tikk();
	}
	System.out.println();
    }
}
