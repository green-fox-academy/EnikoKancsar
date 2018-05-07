import java.util.ArrayList;

public class SharpieSet {
    private ArrayList<Sharpie> sharpieSet;

    public SharpieSet() {
        sharpieSet = new ArrayList<>();
    }

    public int countUsable() {
        int counter = 0;
        for (Sharpie currentSharpie : sharpieSet) {
            if (currentSharpie.getInkAmount() > 0) {
                counter++;
            }
        }
        return counter;
    }

    public void removeTrash() {
        for (Sharpie currentSharpie : sharpieSet) {
            if (currentSharpie.getInkAmount() == 0) {
                sharpieSet.remove(currentSharpie);
            }
        }
    }
}
