import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int number = 8;
        Scanner sc = new Scanner(System.in);
        int input = 7;
        while (input != number) {
            input = sc.nextInt();
            if (number > input)
                System.out.println("The stored number is higher");
            else if (number < input)
                System.out.println("The stored number is lower");
        }
        System.out.println("You found the number: " + input);
    }
}
