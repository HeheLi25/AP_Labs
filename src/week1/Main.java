package week1;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		try {
			ArrayList<Cipher> ciphers = new ArrayList();
			ciphers.add(new Vignere("SPRING"));
			ciphers.add(new Mono("SPRING"));
			for(int i = 'A'; i <= 'Z'; i++)
				System.out.print(ciphers.get(0).encode((char)i));
			System.out.println();
			for(int i = 'A'; i <= 'Z'; i++)
				System.out.print(ciphers.get(1).encode((char)i));
			System.out.println();
			ArrayList<CipherString> c2 = new ArrayList();
			c2.add(new Vignere("WINTER"));
			c2.add(new Mono("WINTER"));
			System.out.println(c2.get(0).encode("SUMMER"));	
			System.out.println(c2.get(1).encode("SUMMER"));		
		} catch (BadKeywordException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
