import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
    public static void main(String[] args) {
        writeMultipleLines("my-file.txt", "apple", 5);
    }

    public static void writeMultipleLines (String locationOfFile, String word, int numberOfLines) {
        List<String> content = new ArrayList();
        for (int i = 0; i < numberOfLines; i++) {
            content.add(word);
        }
        Path path = Paths.get(locationOfFile);
        try {
            Files.write(path, content);
        } catch (IOException e) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}
