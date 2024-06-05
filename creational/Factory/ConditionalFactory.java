package creational.Factory;

public class ConditionalFactory {
    public Product getProduct( String product) {
        if ( product.equals("MAKEUP") ) {
            return new MakeupProduct();
        }
        else if ( product.equals("ELECTRONIC") ) {
            return new ElectronicProduct();
        }
        else{
            return null;
        }
    }
}
