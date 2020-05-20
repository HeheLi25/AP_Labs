package exam;

public class PlainBurger extends Burger{
	@Override
	public double getPrice() {
		return 5;
	}
	@Override
	public String getDescription() {
		return "Contains: Bread; Beef; Lettuce; Ketchup;";
	}
}
