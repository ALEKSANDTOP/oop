public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();


        Product product1 = new Product("Lays", 90.0);
        Product product2 = new Product("Twix", 85.0);
        Product product3 = new Bottle("Coca Cola", 75.0, 1);
        Product product4 = new HotWater("чай", 50.0, 1, 100);

        vendingMachine.addProduct(product1);
        vendingMachine.addProduct(product2);
        vendingMachine.addProduct(product3);
        vendingMachine.addProduct(product4);

        System.out.println(vendingMachine);
    }
}
