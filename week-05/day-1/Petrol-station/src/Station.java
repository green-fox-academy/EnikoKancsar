public class Station {
    private int gasAmount;

    public void refill(Car car) {
        gasAmount -= car.getCapacity();
        car.setGasAmount(car.getCapacity());
    }
}
