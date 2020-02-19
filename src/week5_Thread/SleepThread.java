package week5_Thread;

import java.util.Random;

public class SleepThread implements Runnable{
	//int num;
	public SleepThread() {
	}

	@Override
	public void run() {
		Random rand = new Random();
		int sleepTime = rand.nextInt(5000);
		try {
			Thread.sleep(sleepTime);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" have sleeped for "+sleepTime+"ms");
		
	}
	

}
