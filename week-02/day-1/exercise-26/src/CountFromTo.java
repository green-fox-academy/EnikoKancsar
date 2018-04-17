import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("first number:");
        int i1 = sc.nextInt();
        System.out.println("second number:");
        int i2 = sc.nextInt();

        if (i2 <= i1)
            System.out.println("The second number should be bigger");
        else {
            for (int i = i1; i <= i2; i++)
                System.out.println(i);
        }
    }
}
