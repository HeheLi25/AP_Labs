package week8;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;


public class MotivateServer{

	private static int PORT = 8765;
	private static ServerSocket listener;
    
    public static void main(String[] args) {
    	Socket client = null;
    	try {
			listener = new ServerSocket(PORT);
			while(true) {
				new Handler(listener.accept()).start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				listener.close();
				client.close();
			} catch (IOException e) {e.printStackTrace();}
		}    	
    }
    
    private static class Handler extends Thread{
    	private Socket socket;
		public Handler(Socket socket) {
			this.socket = socket;
		}
		public void run() {
			try {
				System.out.println("A client has connected.");
				PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
				ArrayList<String> q = QuoteLoader.loadQuotes("quotes.txt");
	            Scanner reader = new Scanner(socket.getInputStream());
			//	while (true) {
					while (reader.hasNextLine()) {
						String input = reader.nextLine();
						
						if (input.equals("MOTIVATEME")) {
							System.out.println(input);
							Random r = new Random();
							int i = r.nextInt(q.size());
							String s = q.get(i);
							out.println(s);
						} else if (input.length()>9 && input.substring(0, 9).equals("ADDQUOTE:")) {
							//System.out.println(input);
							String newQuote = input.substring(9);
							System.out.println(newQuote);
//							while(true) {
//								try {newQuote = newQuote + reader.nextLine();}
//								catch(Exception e) {break;}
//							}
							System.out.println(newQuote);
							QuoteLoader.writeQuote(newQuote);
							out.println("Success.");
						} else {
							out.println("Error.");
						}
						//out.flush();
					}
			//	}
//				while(true) {
//					Random r = new Random();
//					int i = r.nextInt(q.size());
//					String s = q.get(i);
//					out.println(s);
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {e.printStackTrace();}
//				}
			}catch(IOException e) {
				e.printStackTrace();
			}finally {
				try {
					this.socket.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
    }

	
	
	

}
