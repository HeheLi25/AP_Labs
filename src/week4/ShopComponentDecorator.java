package week4;

public abstract class ShopComponentDecorator {
	protected ShopComponent c;
	public ShopComponentDecorator(ShopComponent c) {
		this.c = c;
	}
	
	public Double compPrice() {
		return c.compPrice();
	}
	public String toString() {
		return c.toString();
	}

}
