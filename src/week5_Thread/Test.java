package week5_Thread;

public class Test {
	public static void main(String[] args) {
//		SleepThread st = new SleepThread();
//		Thread t1 = new Thread(st);
//		Thread t2 = new SleepThread2();
//		t2.start();
//		t1.start();
		
//		for(int i = 0; i<10; i++) {
//			SleepThread st = new SleepThread();
//			Thread t = new Thread(st, "ThreadName"+i);
//			t.start();
//			try {
//				t.join();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		System.out.println("All threads have been ended.");
		
		int nRows = 100;
		int nCols = 50;
		Double[][] randArray = new Double[nRows][nCols];
		for (int r = 0; r < nRows; r++) {
			for (int c = 0; c < nCols; c++) {
				randArray[r][c] = Math.random();
			}
		}
		double max = -1;
		for(int r = 0;  r < nRows; r++) {
			for(int c = 0; c< nCols; c++) {
				if(randArray[r][c] > max) max = randArray[r][c];
			}
		}
		//------------------------------------------------------//
		
//		Double[] result = new Double[nRows];
//		for(int i = 0; i < 100; i++) {
//			FindMax fm = new FindMax(randArray[i],result,i);
//			Thread t = new Thread(fm);
//			t.start();
//			try {
//				t.join();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		Double[] finalMax = new Double[1];
//		FindMax fm = new FindMax(result, finalMax, 0);
//		Thread t = new Thread(fm);
//		t.start();
//		try {
//			t.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("Result 1:"+max+"\nResult 2:"+finalMax[0]);
		
		//------------------------------------------------------//
		
		SharedDouble sd = new SharedDouble();
		sd.setD(0.0);
//		SharedDouble2 sd = new SharedDouble2(0.0);
		for(int i = 0; i < 100; i++) {
			FindMax2 fm = new FindMax2(randArray[i],sd);
//			FindMax3 fm = new FindMax3(randArray[i],sd);
			Thread t = new Thread(fm);
			t.start();
		}
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Result 1:"+max+"\nResult 2:"+sd.getD());
		
	}
}
