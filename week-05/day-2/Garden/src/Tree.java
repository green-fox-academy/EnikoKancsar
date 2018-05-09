public class Tree extends Plant {
    public Tree(String color, double waterAmount) {
        super(color, waterAmount);
    }

    public boolean needsWater() {
        if (waterAmount < 10) {
            return true;
        } else {
            return false;
        }
    }

    public void watering(double amountOfWater) {
        waterAmount += amountOfWater * 0.4;
    }

    public void print() {
        if (this.needsWater()) {
            System.out.println("The " + color + " Tree needs water.");
        } else {
            System.out.println("The " + color + " Tree doesn't need water.");
        }
    }
}
