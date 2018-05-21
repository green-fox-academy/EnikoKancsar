import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AircraftCarrier {
    private ArrayList<Aircraft> aircrafts;
    private int storeOfAmmo;
    private int health;

    public AircraftCarrier(int storeOfAmmo, int health) {
        aircrafts = new ArrayList<>();
        this.storeOfAmmo = storeOfAmmo;
        this.health = health;
    }

    public void add(Aircraft aircraft) {
        aircrafts.add(aircraft);
    }

    public int fill() throws NoAmmoException {
        if (storeOfAmmo == 0) {
            throw new NoAmmoException("There's no ammo!");
        }
        int currentAircraft = 0;
        while (storeOfAmmo > 0 && currentAircraft < aircrafts.size()) {
            if (aircrafts.get(currentAircraft).isPriority()) {
                storeOfAmmo = aircrafts.get(currentAircraft).refill(storeOfAmmo);
            }
            currentAircraft++;
        }
        currentAircraft = 0;
        while (storeOfAmmo > 0 && currentAircraft < aircrafts.size()) {
            if (!aircrafts.get(currentAircraft).isPriority()) {
                storeOfAmmo = aircrafts.get(currentAircraft).refill(storeOfAmmo);
            }
            currentAircraft++;
        }
        return storeOfAmmo;
    }

    public static void main(String[] args) {

    }
}
