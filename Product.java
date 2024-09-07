public class Product {

    protected String name;
    protected Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String GetName(){
        return name;
    }
    public  Double GetPrice(){
        return price;
    }

    @Override
    public String toString() {
        return " name: " +  name + ", " +  "price: " + price + " руб";
    }
}
