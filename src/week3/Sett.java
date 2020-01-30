package week3;

import java.util.Iterator;
import java.util.Random;

public class Sett implements Iterable {
	private double[] set;
	public Sett(int length) {
		set  = new double[length];
		Random r = new Random();
		for(int i = 0; i < length; i++) {
			set[i] = r.nextDouble() - 0.5;
		}
	}
	@Override
	public Iterator<Double> iterator() {
		Iterator<Double> i = new SettIterator(this);
		return i;
	}
	public double[] getSet() {
		return set;
	}
	
	

}
