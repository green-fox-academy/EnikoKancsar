public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(factorial(number));
    }

    private static int factorial(int number) {
        for (int i = number - 1; i > 0; i--) {
            number *= i;
        }
        return number;
    }
}
