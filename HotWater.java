public class HotWater extends Bottle{
    protected int temperature;

    public HotWater(String name, Double price, double volume, int temperature) {
        super(name, price, volume);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() + ", температруа: " + temperature + " градусов";
    }
}
