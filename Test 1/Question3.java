import java.io.*;
import java.util.*;

public class Question3 {
    public static void main(String [] args) {

        // The name of the file to open.
        String fileName = "B.BIN";
		String fileName2 = "C.txt";
        // This will reference one line at a time
        String line = null;

        try {
            FileReader fileReader = 
                new FileReader(fileName);
				
					FileWriter fileWriter =
					new FileWriter(fileName2);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
				
					// Always wrap FileWriter in BufferedWriter.
					BufferedWriter bufferedWriter =
						new BufferedWriter(fileWriter);

            while ((line = bufferedReader.readLine()) != null)
			{
			//instead of using System.out.println(line); we put condition to reverse the string
			//char[] try1 = line.toCharArray();
			//for (int i = try1.length-1;i>=0;i--) 
				//System.out.print(try1[i]);
			
			// append a string.
			bufferedWriter.write(line);
			
            }   

            // Always close files.
            bufferedReader.close();
			bufferedWriter.close();			
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }
}
