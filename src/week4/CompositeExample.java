package week4;
public class CompositeExample {
	public static void main(String[] args) {

		// Create some leaf objects
		ShopLeaf pencil = new ShopLeaf(1.0,"Pencil");
		ShopLeaf notebook = new ShopLeaf(9.0,"Notebook");
		ShopLeaf printerInk = new ShopLeaf(105.0,"Ink");


		// Create a composite object
		ShopComposite backToSchool = new ShopComposite("Back To School");
		// Add some leaves to it
		backToSchool.add(pencil);
		backToSchool.add(notebook);
		System.out.println(backToSchool + " costs " + backToSchool.compPrice());
		StaffDiscountDecorator d1 = new StaffDiscountDecorator(backToSchool);
		System.out.println(d1 + " costs " + d1.compPrice());
		StudentDiscountDecorator d2 = new StudentDiscountDecorator(backToSchool);
		System.out.println(d2 + " costs " + d2.compPrice());

	}
}