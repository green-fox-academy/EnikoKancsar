public class Main {
    public static void main(String[] args) {
        Gnirts g = new Gnirts("examply");
        System.out.println(g.charAt(2));
        System.out.println(g.length());
        System.out.println(g.subSequence(2, 6));

        Shifter s = new Shifter("examply", 2);
        System.out.println(s.charAt(0));
        System.out.println(s.length());
        System.out.println(s.subSequence(0, 4));
    }
}
