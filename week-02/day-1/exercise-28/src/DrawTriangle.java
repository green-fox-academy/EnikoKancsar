import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String a = "*";
        for (int i = 1; i <= number; ++i) {
            System.out.println(a);
            a += "*";
        }
    }
}
