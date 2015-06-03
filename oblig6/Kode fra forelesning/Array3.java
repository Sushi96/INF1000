import java.util.ArrayList;

class Array3 {
    public static void main(String[] arg) {
	int n;
	ArrayList<Integer> a = new ArrayList<>();

	a.add(-1);
	a.add(1, -2);

	n = a.get(1);

	n = a.size();
    }
}
