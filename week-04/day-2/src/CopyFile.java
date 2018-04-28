import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        System.out.println(copyFile("source-file.txt", "destination-file.txt"));
    }

    public static boolean copyFile (String source, String destination) {
        Path pathOfSource = Paths.get(source);
        Path pathOfDestination = Paths.get(destination);
        try {
            List<String> content = Files.readAllLines(pathOfSource);
            Files.write(pathOfDestination, content);
            return true;
        } catch (IOException e) {
            System.out.println("Source file not found.");
            return false;
        }
    }
}