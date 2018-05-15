import java.util.HashMap;
import java.util.Map;

public class CountLetters {
    public static void main(String[] args) {

    }

    public static Map<Character, Integer> countLetters(String string) {
        Map<Character, Integer> letterCounts = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            if (!letterCounts.containsKey(string.charAt(i))) {
                letterCounts.put(string.charAt(i), 1);
            } else if (letterCounts.containsKey(string.charAt(i))){
                letterCounts.replace(string.charAt(i), letterCounts.get(string.charAt(i)) + 1);
            }
        }
        return letterCounts;
    }
}
