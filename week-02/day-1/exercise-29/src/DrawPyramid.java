import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = "*";
        String s = " ";
        for (int i = 1; i <= n; ++i) {
            for (int j = n; j > i; --j)
                s += " ";
            System.out.println(s + a);
            a += "**";
            s = " ";
        }
    }
}
