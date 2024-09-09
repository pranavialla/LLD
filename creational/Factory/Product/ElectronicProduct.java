package creational.Factory.Product;

public class ElectronicProduct implements Product {
    @Override
    public void display() {
        System.out.println("electronic product created");
    }
}
