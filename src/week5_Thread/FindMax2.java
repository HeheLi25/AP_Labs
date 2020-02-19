package week5_Thread;

public class FindMax2 implements Runnable{
	Double[] randArray;
	SharedDouble d;
	public FindMax2(Double[] randArray,SharedDouble doub) {
		d = doub;
		this.randArray = randArray;
	}
	
	@Override
	public void run() {
		double max = -1;
		for(int i = 0; i< randArray.length; i++) {
			if(randArray[i] > max) max = randArray[i];
		}
		if(max > d.getD()) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			d.setD(max);
		}
		//System.out.println(max);
	}
	


}
