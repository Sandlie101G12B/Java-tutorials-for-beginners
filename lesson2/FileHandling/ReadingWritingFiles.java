
import java.io.*;

public class ReadingWritingFiles {

    public static void main(String[] args) {
        String filePath = "example.txt";

        // Writing to a file using FileWriter
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Hello, world!"); // Writing data to the file
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading from a file using BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Reading data from the file
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
