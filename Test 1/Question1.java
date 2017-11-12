import java.io.*;

public class Question1 {
    public static void main(String [] args) {

        // T0 create file with name.
        String fileName = "A.txt";

        try {
            FileWriter fileWriter =
                new FileWriter(fileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);

            // append a newline character.
            bufferedWriter.write("A1B2C3D4E5");

            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName + "'");
           
        }
    }
}