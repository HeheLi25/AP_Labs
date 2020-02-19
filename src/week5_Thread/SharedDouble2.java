package week5_Thread;

public class SharedDouble2 {
	private Double d;
	
	public SharedDouble2(double d) {
		this.d = d;
	}

	public Double getD() {
		return d;
	}

	public void compare(Double a) {
		synchronized (this) {
			if (a > d) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				d = a;
			}
		}
	}
}
