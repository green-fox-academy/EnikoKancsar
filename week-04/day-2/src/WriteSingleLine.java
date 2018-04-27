import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {
        List<String> content = new ArrayList();
        content.add("Kancsár Enikő");
        Path path = Paths.get("my-file.txt");
        try {
            Files.write(path, content);
        } catch (IOException e) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}
