package exam;

public class BaconDecorator extends Burger{
	Burger burger;
	
	public BaconDecorator(Burger burger){
		this.burger = burger;
	}

	@Override
	public double getPrice() {
		return burger.getPrice()+2;
	}

	@Override
	public String getDescription() {
		return burger.getDescription()+" Burger;";
	}



}
