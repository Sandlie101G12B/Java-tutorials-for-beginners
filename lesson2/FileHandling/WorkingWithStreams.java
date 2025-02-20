
import java.io.*;

public class WorkingWithStreams {

    public static void main(String[] args) {
        String filePath = "example.txt";

        // Writing to a file using OutputStream
        try (OutputStream outputStream = new FileOutputStream(filePath)) {
            String data = "Hello, world!";
            outputStream.write(data.getBytes()); // Writing data to the file
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading from a file using InputStream
        try (InputStream inputStream = new FileInputStream(filePath)) {
            int content;
            while ((content = inputStream.read()) != -1) {
                System.out.print((char) content); // Reading data from the file
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
