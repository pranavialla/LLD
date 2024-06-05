package behavioural.Strategy;

public class Item {
    private String UPCCode;
    private int price;

    public Item(String UPCCode, int price) {
        this.UPCCode = UPCCode;
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }
}
