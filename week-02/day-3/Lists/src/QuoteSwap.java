import java.util.*;

public class QuoteSwap{
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
        System.out.println(quoteSwap(list));
    }

    private static String quoteSwap(ArrayList<String> list) {
        String tmp = list.get(2);
        list.set(2, list.get(5));
        list.set(5, tmp);
        return String.join(" ", list);
    }
}