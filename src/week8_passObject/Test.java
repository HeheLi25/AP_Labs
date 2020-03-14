package week8_passObject;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import week8.QuoteLoader;

public class Test {
	private static int PORT = 8765;
	private static ServerSocket listener;
	private static int nRows = 100;
	private static int nCols = 50;
	private static Double[][] randArray = new Double[nRows][nCols];
	public static void main(String[] args) {

		
		for (int r = 0; r < nRows; r++) {
			for (int c = 0; c < nCols; c++) {
				randArray[r][c] = Math.random();
			}
		}
		double max = -1;
		for(int r = 0;  r < nRows; r++) {
			for(int c = 0; c< nCols; c++) {
				if(randArray[r][c] > max) max = randArray[r][c];
			}
		}
		
		Double[] result = new Double[nRows];
		Socket client = null;
		try {
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
    	
 
		System.out.println("Result 1:"+max+"\nResult 2:");
		

		
	}
	//------------------------------------------------------//
	 private static class Handler extends Thread{
	    	private Socket socket;
			public Handler(Socket socket) {
				this.socket = socket;
			}
			public void run() {
				try {
					System.out.println("A client has connected.");
					PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
		            Scanner reader = new Scanner(socket.getInputStream());
		            //out.print();
						while (reader.hasNextLine()) {

							
						}

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
