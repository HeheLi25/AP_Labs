package week3;

import java.util.Iterator;

public class Test {
	public static void main(String args[]) {
		Sett set = new Sett(10);
		for(Double d : set.getSet()) {
			System.out.println(d);
		}

		System.out.println("-------------------------");
		Iterator<Double> i = set.iterator();
		System.out.println(i.hasNext());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.hasNext());
		
	}

	

}
