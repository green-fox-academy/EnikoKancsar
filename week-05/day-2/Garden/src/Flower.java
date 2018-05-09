public class Flower extends Plant {
    public Flower(String color, double waterAmount) {
        super(color, waterAmount);
    }

    public boolean needsWater() {
        if (waterAmount < 5) {
            return true;
        } else {
            return false;
        }
    }

    public void watering(double amountOfWater) {
        waterAmount += amountOfWater * 0.75;
    }

    public void print() {
        if (this.needsWater()) {
            System.out.println("The " + color + " Flower needs water.");
        } else {
            System.out.println("The " + color + " Flower doesn't need water.");
        }
    }
}
