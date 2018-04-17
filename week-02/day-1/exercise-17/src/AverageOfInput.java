import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        int tmp;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            tmp = scanner.nextInt();
            sum += tmp;
        }
        System.out.println("Sum: " + sum + ", Average: " + sum/5.);
    }
}
