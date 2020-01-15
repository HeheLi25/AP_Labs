package dictionary;

public class ValueType {
	private String contact;
	public ValueType(String contact){
		this.contact = contact;
	}
	public String getName() {
		return contact;
	}
	public void setName(String contact) {
		this.contact = contact;
	}
	public String toString(){
		return contact;
	}
}
