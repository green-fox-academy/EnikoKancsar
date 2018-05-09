public class Plant {
    protected String color;
    protected double waterAmount;

    public Plant (String color, double waterAmount) {
        this.color = color;
        this.waterAmount = waterAmount;
    }

    public void print() {
        System.out.println("It's a plant.");
    }

    public boolean needsWater() {
        return true;
    }

    public void watering(double amountOfWater) {
        waterAmount += amountOfWater;
    }
}
