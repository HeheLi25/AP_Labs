package week5_Thread;

import java.util.Random;

public class SleepThread2 extends Thread{
	public void run() {
		Random rand = new Random();
		int sleepTime = rand.nextInt(5000);
		try {
			Thread.sleep(sleepTime);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread2 have sleeped for "+sleepTime+"ms");
	}
}
