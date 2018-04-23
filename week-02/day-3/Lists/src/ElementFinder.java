import java.util.*;

public class ElementFinder{
    public static void main(String... args){
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(containsSeven(arrayList));
    }

    private static String containsSeven(ArrayList<Integer> arrayList) {
        for (Integer currentInteger: arrayList) {
            if (currentInteger == 7) {
                return "Hoorray";
            }
        }
        return "Noooooo";
    }
}