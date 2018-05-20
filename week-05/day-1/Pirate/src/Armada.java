import java.util.ArrayList;

public class Armada {
    private ArrayList<Ship> ships;

    public ArrayList<Ship> getShips() {
        return ships;
    }

    public void fillArmada() {
        int numberOfShips = (int)(Math.random() * 10 + 1);
        for (int i = 0; i < numberOfShips; i++) {
            Ship ship = new Ship();
            getShips().add(ship);
        }
    }

    public boolean war(Armada otherArmada) {
        int indexInThis = 0;
        int indexInOther = 0;
        while (indexInThis < getShips().size() || indexInOther < otherArmada.getShips().size()) {
            if (getShips().get(indexInThis).battle(otherArmada.getShips().get(indexInOther))) {
                indexInOther++;
            } else {
                indexInThis++;
            }
        }
        return (indexInThis < getShips().size());
    }
}
