package week5_Thread;

public class FindMax3 implements Runnable{
	Double[] randArray;
	SharedDouble2 d;
	public FindMax3(Double[] randArray,SharedDouble2 doub) {
		d = doub;
		this.randArray = randArray;
	}
	
	@Override
	public void run() {
		double max = -1;
		for(int i = 0; i< randArray.length; i++) {
			if(randArray[i] > max) max = randArray[i];
		}
		d.compare(max);
		System.out.println(max);
	}
	


}
