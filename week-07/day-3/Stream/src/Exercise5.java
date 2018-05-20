public class Exercise5 {
    public static void main(String[] args) {
        "HabLATy".chars()
                .filter(Character::isUpperCase)
                .forEach(c -> System.out.println((char) c));
    }
}
