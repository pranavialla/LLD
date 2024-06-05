package behavioural.NullObject;



public class ConditionalFactoryNullObj {
    public ProductWithNullObj getProduct(String product) {
        if ( product.equals("MAKEUP") ) {
            return new MakeupProduct();
        }
        else if ( product.equals("ELECTRONIC") ) {
            return new ElectronicProduct();
        }
        else{
            return new NullObject();
        }
    }
}
