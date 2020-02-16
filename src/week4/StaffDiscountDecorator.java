package week4;

public class StaffDiscountDecorator extends ShopComponentDecorator{
	
	public StaffDiscountDecorator(ShopComponent c) {
		super(c);
	}

	@Override
	public Double compPrice() {
		return super.compPrice()*0.5;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"(Staff discounted 50%)";
	}
	

}
