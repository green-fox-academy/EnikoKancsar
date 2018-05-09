import java.util.ArrayList;

public class Garden {
    private ArrayList<Plant> plants;

    public Garden() {
        plants = new ArrayList<>();
    }

    public void add(Plant plant) {
        plants.add(plant);
    }

    public void currentState() {
        for (Plant currentPlant : plants) {
            currentPlant.print();
        }
    }

    public double howManyNeedsWater() {
        int counter = 0;
        for (Plant currentPlant : plants) {
            if (currentPlant.needsWater()) {
                counter++;
            }
        }
        return counter;
    }

    public void watering(double amountOfWater) {
        System.out.println("Watering with " + amountOfWater);

        double wateringEachWith = amountOfWater / howManyNeedsWater();

        for (Plant currentPlant: plants) {
            if (currentPlant.needsWater()) {
                currentPlant.watering(wateringEachWith);
            }
        }
    }
}
