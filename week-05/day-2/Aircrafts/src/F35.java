public class F35 extends Aircraft {
    public F35() {
        super(12, 50, "F35");
    }

    @Override
    public boolean isPriority() {
        return true;
    }

}
