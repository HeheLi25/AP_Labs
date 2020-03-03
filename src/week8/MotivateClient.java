package week8;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MotivateClient {
	public static void main(String[] args) {
        Socket server = null;
        try {
            server = new Socket("127.0.0.1",8765);
            Scanner reader = new Scanner(server.getInputStream());
            Scanner s = new Scanner(System.in);
            while(s.hasNextLine()) {
            	String str = s.nextLine();
            	PrintWriter writer = new PrintWriter(server.getOutputStream());
            	writer.println(str);
            	//System.out.println(str);
            	writer.flush();   	
    			if(reader.hasNextLine()) {
    				System.out.println(reader.nextLine());
    			}
            }
            

			reader.close();
        }catch(IOException e) {
            e.printStackTrace();
        }finally {
            try {
                server.close();
            }catch(IOException e) {
                e.printStackTrace();
            }
        }
    }

}
