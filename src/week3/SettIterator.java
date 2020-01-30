package week3;

import java.util.Iterator;

public class SettIterator implements Iterator<Double> {
	double[] set;
	int position;
	public SettIterator(Sett sett) {
		set = sett.getSet();
		position = -1;
	}
	
	public boolean hasNext() {
		int startPosition = position;
		int counter = 0;
		for(int i = startPosition; i < set.length; i++) {
			Double result = next();
			if(result != null) counter++;
		}
		position = startPosition;
		if(counter >0) {
			return true;
		}else {
			return false;
		}
		
	}
	public Double next() {
		position++;
		if(position >= set.length) return null;
		while(set[position] <= 0) {
			position ++;
		}
		if(position < set.length)return set[position];
		else return null;
	}
}
