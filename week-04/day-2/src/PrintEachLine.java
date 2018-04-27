import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PrintEachLine {
    public static void main(String[] args) {
        Path path = Paths.get("my-file.txt");
        try {
            System.out.println(Files.readAllLines(path));
        } catch (IOException e) {
            System.out.println("Unable to read file: my-file.txt");
        }
    }
}
