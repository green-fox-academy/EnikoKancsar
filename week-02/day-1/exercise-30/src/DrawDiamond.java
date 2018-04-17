import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = "*";
        String s = " ";
        for (int i = 1; i <= n / 2; ++i) {
            for (int j = n / 2; j > i; --j)
                s += " ";
            System.out.println(s + a);
            a += "**";
            s = " ";
        }
        if (n % 2 == 1) {
            a = "*";
            for (int i = 1; i < n; ++i)
                a += "*";
            System.out.println(a);
        }
        for (int i = n / 2; i >= 1; --i) {
            a = "*";
            for (int j = 1; j < i; ++j)
                a += "**";
            System.out.println(s + a);
            s += " ";
        }
    }
}