import java.util.stream.Collectors;

public class Exercise7 {
    public static void main(String[] args) {
        System.out.println("almamalom".chars()
                                        .boxed()
                                        .collect(Collectors.groupingBy(i -> (char)(int) i,
                                                                Collectors.counting())));
    }
}
