package week8;

import java.util.ArrayList;
import java.io.*;
public class QuoteLoader {
	public static ArrayList<String> loadQuotes(String filename) {
		ArrayList<String> q = new ArrayList<String>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			String line;
			while((line = reader.readLine())!=null) {
				q.add(line);
			}
			reader.close();
			return q;
		}catch(IOException e) {}
		return q;
	}
	public static void writeQuote(String quotes) {
		quotes = "\n" + quotes;
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("quotes.txt",true));
			writer.write(quotes);
			writer.close();
		}catch(IOException e) {}
	}
	
	public static void main(String[] args) {
//		ArrayList<String> q = loadQuotes("quotes.txt");
//		for(String s:q) {
//			System.out.println(s);
//		}
		writeQuote("New quote 1.");
	}
}