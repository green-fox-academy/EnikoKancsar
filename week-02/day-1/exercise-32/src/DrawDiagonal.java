import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s1 = "%";
        String s2 = "%";
        for (int i = 1; i < n; ++i)
            s1 += "%";
        System.out.println(s1);
        for (int i = 1; i < n - 1; ++i) {
            for (int j = 1; j < n - 1; ++j) {
                if (i == j)
                    s2 += "%";
                else
                    s2 += " ";
            }
            s2 += "%";
            System.out.println(s2);
            s2 = "%";
        }
        System.out.println(s1);
    }
}
