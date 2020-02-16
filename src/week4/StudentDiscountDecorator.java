package week4;

public class StudentDiscountDecorator extends ShopComponentDecorator{

	public StudentDiscountDecorator(ShopComponent c) {
		super(c);
	}

	@Override
	public Double compPrice() {
		return super.compPrice()*0.9;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"(Student discounted 10%)";
	}
	

}
