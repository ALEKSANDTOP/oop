import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine() {
        products = new ArrayList<>();
    }

    public int size(){
        return products.size();
    }


    public void addProduct(Product product){
        products.add(product);
    }

    public Product getByName(String name){
        for (Product product : products) {
            if (product.GetName().equals(name)){
                return product;
            }
        }
        return null;
    }



    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Продукты: ");
        stringBuilder.append("\n");
        for (Product product : products) {
            stringBuilder.append(product);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
