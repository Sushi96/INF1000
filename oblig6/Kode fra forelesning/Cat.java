import java.util.Scanner;
import java.io.*;

class Cat {
    public static void main(String[] arg) throws Exception {
	File f = new File(arg[0]);
	if (f.exists()) {
	    Scanner s = new Scanner(f);
	    while (s.hasNextLine()) {
		String t = s.nextLine();
		System.out.println(t);
	    }
	    s.close();
	}
    }
}