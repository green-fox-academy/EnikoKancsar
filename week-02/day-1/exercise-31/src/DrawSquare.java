import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s1 = "%";
        String s2 = "%";
        for (int i = 2; i < n; ++i) {
            s1 += "%";
            s2 += " ";
        }
        s1 += "%";
        s2 += "%";
        System.out.println(s1);
        for (int i = 2; i < n; ++i)
            System.out.println(s2);
        System.out.println(s1);
    }
}
