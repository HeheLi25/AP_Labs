package exam;

public abstract class Person {
	private double height;
	private double weight;	
	public Person(){
		
	}
	public void breathe(){
		System.out.println("I am breathing...");
	}
	public abstract void greet();
	public abstract void sing();
	public abstract void dance();
}
