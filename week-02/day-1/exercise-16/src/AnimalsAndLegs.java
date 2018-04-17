import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickens = scanner.nextInt();
        int pigs = scanner.nextInt();
        System.out.println(chickens * 2 + pigs * 4);
    }
}
