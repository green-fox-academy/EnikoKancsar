import java.util.Arrays;
import java.util.stream.Collectors;

public class Exercise9 {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(new Character[] {'a', 'b', 'c', 'd', 'e', 'f', 'g'})
                                    .map(c -> Character.toString(c))
                                    .collect(Collectors.joining()));
    }
}
