public class Gnirts implements CharSequence{
    private String field;

    public Gnirts(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    @Override
    public char charAt(int index) {
        return field.charAt(field.length() - 1 - index);
    }

    @Override
    public int length() {
        return field.length();
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        StringBuilder string  = new StringBuilder("");
        for (int i = field.length() - 1 - start; i > field.length() - 1 - end; i--) {
            string.append(field.charAt(i));
        }
        return string;
    }

    public static void main(String[] args) {
        Gnirts g = new Gnirts("examply");
        System.out.println(g.charAt(2));
        System.out.println(g.length());
        System.out.println(g.subSequence(2, 6));
    }
}
