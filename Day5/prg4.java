package Day5;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class  prg4 {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("aax.jpg");
             FileOutputStream output = new FileOutputStream("copy.jpg")) {

            int b;
            while ((b = input.read()) != -1) {
                output.write(b);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error handling file.");
        }
    }
}