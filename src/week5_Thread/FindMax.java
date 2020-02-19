package week5_Thread;

public class FindMax implements Runnable{
	Double[] randArray;
	Double[] result;
	int position;
	public FindMax(Double[] a1, Double[] a2, int pos) {
		randArray = a1;
		result = a2;
		this.position = pos;
	}
	
	@Override
	public void run() {
		double max = -1;
		for(int i = 0; i< randArray.length; i++) {
			if(randArray[i] > max) max = randArray[i];
		}
		result[position] = max;
		//System.out.println(max);
	}
	

}
