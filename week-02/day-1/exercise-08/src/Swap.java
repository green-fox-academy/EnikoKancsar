public class Swap {
    public static void main(String[] args) {
        int a = 123;
        int b = 526;

        int tmp = a;
        a = b;
        b = tmp;

        System.out.println(a);
        System.out.println(b);
    }
}
