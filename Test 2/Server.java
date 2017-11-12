import java.io.BufferedWriter;
import java.io.FileWriter;
import java.net.*;
import java.io.*;

public class Server {
public static void main (String []args) {
               try { 
                      ServerSocket ss = new ServerSocket(1999); 
                      Socket s = ss.accept(); 
		      DataInputStream dis = new DataInputStream(s.getInputStream()); 
                      String k = dis.readUTF(); 
		      /*String data = " Ul Hazazi Bin Ab Wahab"; */
                      System.out.println("File Transferred"); 
		      FileWriter fw = new FileWriter("hidayat_modified.txt", true);
		      BufferedWriter bw = new BufferedWriter(fw);
		      bw.write(k);
                      bw.write(" Ul Hazazi Bin Ab Wahab");
 		      bw.close();
                      
		      /*FileOutputStream fos = new FileOutputStream("roger.txt"); 
                      byte[] b = k.getBytes(); 
                      fos.write(k); */
                     } catch (IOException ie) { 
                       ie.printStackTrace(); 
                     }
          }
}