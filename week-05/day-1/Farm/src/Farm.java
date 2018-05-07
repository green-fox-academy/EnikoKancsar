import java.util.ArrayList;

public class Farm {
    private ArrayList<Animal> animals;
    private int freeSlots;

    public void breed() {
        if (freeSlots != 0) {
            Animal animal = new Animal();
            animals.add(animal);
        }
    }

    public void slaughter() {
        int animalToRemove = 0;
        int minimumHunger = 50;
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).getHunger() < minimumHunger) {
                minimumHunger = animals.get(i).getHunger();
                animalToRemove = i;
            }
        }
        animals.remove(animalToRemove);
    }
}
