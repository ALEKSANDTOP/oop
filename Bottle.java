public class Bottle extends Product {
    private double volume;

    public Bottle(String name, Double price, double volume) {
        super(name, price);
        this.volume = volume;
    }
    public double GetVolume(){
        return volume;
    }

    @Override
    public String toString() {
        return super.toString() + ", Объем: " + volume + " литров";
    }
}
