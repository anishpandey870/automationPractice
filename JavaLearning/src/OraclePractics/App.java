package OraclePractics;

import java.util.ArrayList;

class App {
	public static void main(String[] args) {
		ArrayList<Integer> p = new ArrayList<>();
		p.add(1);
		p.add(2);
		p.add(3);
		p.add(4);
		p.add(null);
		p.remove(1);
		p.remove(null);
		System.out.println(p);
	}
}
