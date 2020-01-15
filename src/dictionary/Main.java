package dictionary;

public class Main {
	public static void main(String args[]){
		AddressBook ab = new AddressBook();
	
		KeyType k1 = new Individual("Chentao");
		ValueType v1 = new Number("1234567");
		KeyType k2 = new Individual("Yirong");
		ValueType v2 = new Number("7654321");
		KeyType k3 = new Business("GlasgowUni");
		ValueType v3 = new Address("University Ave. Glasgow");
		ab.set(k1, v1);
		ab.set(k2, v2);
		ab.set(k3, v3);
		
		System.out.println(ab.get(k1).getName());
		System.out.println();
		System.out.println(ab.toString());
	
	}

}
