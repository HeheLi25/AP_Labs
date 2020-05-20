package exam;

public class CheeseDecorator extends Burger{
	Burger burger;
	
	public CheeseDecorator(Burger burger){
		this.burger = burger;
	}

	@Override
	public double getPrice() {
		return burger.getPrice()+1;
	}

	@Override
	public String getDescription() {
		return burger.getDescription()+" Cheese; ";
	}
}
