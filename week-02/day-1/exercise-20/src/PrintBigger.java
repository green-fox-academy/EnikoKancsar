import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        if (i1 > i2)
            System.out.println(i1);
        else if (i1 == i2)
            System.out.println("Same");
        else
            System.out.println(i2);
    }
}
