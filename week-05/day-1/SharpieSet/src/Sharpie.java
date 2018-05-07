public class Sharpie {
    private String color;
    private double width;
    private double inkAmount;

    public Sharpie(String color, double width) {
        this.color = color;
        this.width = width;
        inkAmount = 100.0;
    }

    public double getInkAmount() {
        return inkAmount;
    }

    public void use() {
        inkAmount--;
    }
}
