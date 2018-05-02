public class SwapElements {
    public static void main(String[] args) {
        String[] abc = {"first", "second", "third"};
        String tmp = abc[0];
        abc[0] = abc[2];
        abc[2] = tmp;
    }
}
