public class Sum {
    public static void main(String[] args) {
        int parameter = 100;
        System.out.println(sum(parameter));
    }

    private static int sum(int param) {
        return param * (param + 1) / 2;
    }
}
