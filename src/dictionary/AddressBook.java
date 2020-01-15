package dictionary;

import java.util.ArrayList;

public class AddressBook {
	ArrayList<KeyType> keys;
	ArrayList<ValueType> values;
	
	public AddressBook(){
		keys = new ArrayList<KeyType>();
		values = new ArrayList<ValueType>();
	}
	public void set(KeyType key, ValueType value){
		keys.add(key);
		values.add(value);
	}
	public ValueType get(KeyType key){
		int i = keys.indexOf(key);
		return values.get(i);
	}
	public String toString(){
		String result = "";
		for(int i = 0; i< keys.size(); i++){
			String f = String.format("%-10s : %-15s \n", keys.get(i),values.get(i));
			result = result + f;
		}
		return result;
	}
	

}
