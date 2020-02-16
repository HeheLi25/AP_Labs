package week4;
public class ShopLeaf implements ShopComponent {
	private Double basePrice;
	private String name;
	// Constructor - set the properties of the item
	public ShopLeaf(Double base,String n) {
		basePrice = base;
		name = n;
	}
	// Comp price - only discounts if discounting is allowed
	public Double compPrice() {
			return basePrice;
	}
	// Nice display
	public String toString() {
		return name;
	}
}