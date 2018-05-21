import java.util.ArrayList;

public class AircraftCarrier {
    private ArrayList<Aircraft> aircrafts;
    private int storeOfAmmo;
    private int health;

    public AircraftCarrier(int storeOfAmmo, int health) {
        this.storeOfAmmo = storeOfAmmo;
        this.health = health;
    }

    public void add(Aircraft aircraft) {
        aircrafts.add(aircraft);
    }

    public static void main(String[] args) {

    }
}
