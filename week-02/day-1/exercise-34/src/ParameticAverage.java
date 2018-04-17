import java.util.Scanner;

public class ParameticAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int tmp = 0;
        int sum = 0;
        for (int i = 0; i < number; ++i) {
            tmp = sc.nextInt();
            sum += tmp;
        }
        System.out.println("Sum: " + sum + ", Average: " + sum / number);
    }
}
