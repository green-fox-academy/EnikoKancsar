public class DivideByZero {
    public static void main(String[] args) {
        System.out.println(divideTenWith(0));
    }
    public static int divideTenWith(int number) {
        try {
            return 10 / number;
        } catch (ArithmeticException e) {
            System.out.println("fail");
            return 0;
        }
    }
}
