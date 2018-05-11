public class Shifter implements CharSequence {
    String field;
    int number;

    public Shifter(String field, int number) {
        this.field = field;
        this.number = number;
    }

    @Override
    public char charAt(int index) {
        return field.charAt(index + number);
    }

    @Override
    public int length() {
        return field.length() + number;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        StringBuilder string  = new StringBuilder("");
        for (int i = start; i < end; i++) {
            string.append(field.charAt(i + number));
        }
        return string;
    }
}
