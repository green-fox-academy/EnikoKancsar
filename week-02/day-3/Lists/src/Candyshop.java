import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Candyshop {
    public static void main(String... args){
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);

        System.out.println(sweets(arrayList));
    }

    public static String sweets(ArrayList<Object> arrayList) {
        ArrayList<String> sweetsModified = new ArrayList<>();

        // Azért csináltam így, hogy ha később szeretném belerakni
        // a "Tapioca pudding"-ot, akkor kicsit egyszerűbb legyen.
        String[] newSweets = {"Croissant", "Ice cream"};
        int newSweetsCounter = 0;

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) instanceof String ) {
                sweetsModified.add(arrayList.get(i).toString());
            }
            else {
                sweetsModified.add(newSweets[newSweetsCounter]);
                newSweetsCounter++;
            }
        }
        return String.join(", ", sweetsModified);
    }
}