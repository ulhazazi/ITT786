import java.net.*;
import java.io.*;

public class Client {
public static void main(String[] args) { 

         try {
                 Socket s = new Socket("localhost", 1999); 
                 BufferedReader br = new BufferedReader(new FileReader("hidayat.txt")); 
                 byte []b = new byte[30]; 
                 String k = br.readLine(); 
                 DataOutputStream dos = new DataOutputStream(s.getOutputStream()); 
                 dos.writeUTF(k); 
                 System.out.println("Transfer Complete"); 
                } catch (IOException ie) {
                   ie.printStackTrace(); 
               }
      }
}